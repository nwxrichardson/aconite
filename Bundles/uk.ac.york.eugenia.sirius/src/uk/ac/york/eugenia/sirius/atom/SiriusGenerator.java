package uk.ac.york.eugenia.sirius.atom;

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
import org.eclipse.epsilon.flock.FlockModule;

import util.SDScore;

public class SiriusGenerator extends Job {


	private URI outputURI;
	private Resource output;
	private URI inputURI;
	protected static final String PATH_TO_MIG = "/epsilon/odesign-matchodesign.mig";

	public SiriusGenerator(IFile ecore) {
		super("Generate Matchmodel from Mergemodel");
		this.inputURI = SDScore.getPlatformURI(ecore);
		this.outputURI = SDScore.getMatchPlatformURI(ecore);
	}
	
	@Override
	protected IStatus run(IProgressMonitor monitor) {
		generateMatchodesign();
		
		return Status.OK_STATUS;
	}

	public void generateMatchodesign() {
		EtlModule module = new EtlModule();
		EmfModel original = new OdesignModel();
		EmfModel migrated = new OdesignModel();
				
		original.setModelFileUri(inputURI);;
		original.setName("Source");
		original.setReadOnLoad(true);
		original.setStoredOnDisposal(false);
		
		migrated.setModelFileUri(outputURI);
		migrated.setName("Target");
		migrated.setReadOnLoad(false);
		migrated.setStoredOnDisposal(true);
		
		try {
			original.load();
			migrated.load();
			module.parse(getClass().getResource(PATH_TO_MIG).toURI());
			module.getContext().getNativeTypeDelegates().add(new ExtensionPointToolNativeTypeDelegate());
			module.getContext().getModelRepository().addModel(original);
			module.getContext().getModelRepository().addModel(migrated);
			module.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		output = migrated.getResource();
		module.getContext().getModelRepository().dispose();
	}
	
	//TODO Might not return the right thing
	public Resource getResource() {
		return output;
	}
}
