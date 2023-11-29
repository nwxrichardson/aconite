package uk.ac.york.aconite.atom;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.dt.ExtensionPointToolNativeTypeDelegate;
import org.eclipse.epsilon.etl.EtlModule;

import uk.ac.york.aconite.util.SDScore;

public class SiriusReverser extends Job {


	private URI outputURI;
	private Resource output;
	private URI ecoreURI;
	private URI odesignURI;
	protected static final String PATH_TO_ETL = "/epsilon/odesign-ecore.etl";

	public SiriusReverser(IFile ecore,IFile odesign) {
		super("Generate Odesign from Ecore");
		this.ecoreURI = SDScore.getPlatformURI(ecore);
		this.odesignURI = SDScore.getPlatformURI(odesign);
		this.outputURI = SDScore.getGenEcoreURI(ecore);
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		generateEcore();
		
		return Status.OK_STATUS;
	}

	public void generateEcore() {
		EtlModule module = new EtlModule();
		EmfModel source = new EmfModel();
		EmfModel odesign = new OdesignModel();
		EmfModel target = new EmfModel();
		
		source.setModelFileUri(ecoreURI);;
		source.setName("Source");
		source.setReadOnLoad(true);
		source.setStoredOnDisposal(false);
		
		odesign.setModelFileUri(odesignURI);;
		odesign.setName("Odesign");
		odesign.setReadOnLoad(true);
		odesign.setStoredOnDisposal(false);
		
		target.setModelFileUri(outputURI);
		target.setName("Target");
		target.setReadOnLoad(false);
		target.setStoredOnDisposal(true);
		
		try {
			source.load();
			odesign.load();
			target.load();
			module.parse(getClass().getResource(PATH_TO_ETL).toURI());
			module.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
			module.getContext().getModelRepository().addModel(source);
			module.getContext().getModelRepository().addModel(odesign);
			module.getContext().getModelRepository().addModel(target);
			module.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		output = target.getResource();
		module.getContext().getModelRepository().dispose();
	}
	
	//TODO Might not return the right thing
	public Resource getResource() {
		return output;
	}
}