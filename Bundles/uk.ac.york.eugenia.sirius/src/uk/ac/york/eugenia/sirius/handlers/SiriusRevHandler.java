package uk.ac.york.eugenia.sirius.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

import uk.ac.york.eugenia.sirius.atom.SiriusReverser;

public class SiriusRevHandler extends AbstractHandler{
	
	@Override
	public Object execute(ExecutionEvent event) {
		final ISelection selection0 = HandlerUtil.getCurrentSelection(event);
		if (selection0 instanceof IStructuredSelection) {
			IStructuredSelection selection = (IStructuredSelection) selection0;
			final IFile ecore = (IFile) selection.getFirstElement();
			
			if (ecore != null) {
				SiriusReverser  job = new SiriusReverser(ecore);
				job.setUser(true);
				job.schedule();
			}
		}
		
		return null;
	}
}
