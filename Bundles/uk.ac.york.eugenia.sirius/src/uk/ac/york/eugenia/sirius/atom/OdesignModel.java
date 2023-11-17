package uk.ac.york.eugenia.sirius.atom;

import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;

public class OdesignModel extends EmfModel {

	public OdesignModel() {
		setMetamodelUris(Arrays.asList(SIRIUS_METAMODELS));
		putResourceLoadOption("SIRIUS_USE_URI_FRAGMENT_AS_ID", true);
		putResourceStoreOption("ENCODING", "UTF-8");
	}

	private static final String[] SIRIUS_METAMODELS = new String[] { "http://www.eclipse.org/sirius/1.1.0",
			"http://www.eclipse.org/sirius/description/1.1.0", 
			"http://www.eclipse.org/sirius/description/audit/1.1.0",
			"http://www.eclipse.org/sirius/description/style/1.1.0",
			"http://www.eclipse.org/sirius/description/tool/1.1.0",
			"http://www.eclipse.org/sirius/description/validation/1.1.0", 
			"http://www.eclipse.org/sirius/diagram/1.1.0",
			"http://www.eclipse.org/sirius/diagram/description/1.1.0",
			"http://www.eclipse.org/sirius/diagram/description/concern/1.1.0",
			"http://www.eclipse.org/sirius/diagram/description/filter/1.1.0",
			"http://www.eclipse.org/sirius/diagram/description/style/1.1.0",
			"http://www.eclipse.org/sirius/diagram/description/tool/1.1.0",
			"http://www.eclipse.org/sirius/diagram/sequence/2.0.0",
			"http://www.eclipse.org/sirius/diagram/sequence/description/2.0.0",
			"http://www.eclipse.org/sirius/diagram/sequence/description/tool/2.0.0",
			"http://www.eclipse.org/sirius/diagram/sequence/ordering/2.0.0",
			"http://www.eclipse.org/sirius/diagram/sequence/template/2.0.0",
			//"http://www.eclipse.org/sirius/dsl/formatdata/1.1.0",
			"http://www.eclipse.org/sirius/properties/1.0.0",
			//"http://www.eclipse.org/sirius/properties/1.0.0/ext/widgets/reference",
			"http://www.eclipse.org/sirius/table/1.1.0",
			"http://www.eclipse.org/sirius/table/description/1.1.0",
			"http://www.eclipse.org/sirius/tree/1.0.0",
			"http://www.eclipse.org/sirius/tree/description/1.0.0", };
}