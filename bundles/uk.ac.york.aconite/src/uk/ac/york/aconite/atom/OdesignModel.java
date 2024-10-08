/*********************************************************************
* Copyright (c) 2024 University of York, Rolls-Royce Controls
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package uk.ac.york.aconite.atom;

import java.util.Arrays;

import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.sirius.diagram.DiagramPackage;
import org.eclipse.sirius.viewpoint.ViewpointPackage;

public class OdesignModel extends EmfModel {

	public OdesignModel() {
		setMetamodelUris(Arrays.asList(SIRIUS_METAMODELS));
		putResourceLoadOption("SIRIUS_USE_URI_FRAGMENT_AS_ID", true);
		putResourceStoreOption("ENCODING", "UTF-8");
	}

	private static final String[] SIRIUS_METAMODELS = new String[] {
			ViewpointPackage.eNS_URI,

			// nested within ViewpointPackage
			//DescriptionPackage.eNS_URI,
			//AuditPackage.eNS_URI,
			//StylePackage.eNS_URI,
			//ToolPackage.eNS_URI,
			//ValidationPackage.eNS_URI,

			DiagramPackage.eNS_URI,

			// nested within DiagramPackage
			//DescriptionPackage.eNS_URI,
			//ConcernPackage.eNS_URI,
			//FilterPackage.eNS_URI,
			//StylePackage.eNS_URI,
			//ToolPackage.eNS_URI
	};

}