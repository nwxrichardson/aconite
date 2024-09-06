/*********************************************************************
* Copyright (c) 2024 University of York, Rolls-Royce Controls
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
**********************************************************************/
package uk.ac.york.aconite.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.ac.york.aconite.atom.SiriusGenerator;

public class SiriusGenHandler extends AbstractHandler{
	
	@Override
	public Object execute(ExecutionEvent event) {
		final ISelection selection0 = HandlerUtil.getCurrentSelection(event);
		if (selection0 instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) selection0;
			final IFile ecore = (IFile) selection.getFirstElement();
			
			if (ecore != null) {
				SiriusGenerator  job = new SiriusGenerator(ecore);
				job.setUser(true);
				job.schedule();
			}
		}
		
		return null;
	}
}
