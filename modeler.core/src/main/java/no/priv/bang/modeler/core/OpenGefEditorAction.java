package no.priv.bang.modeler.core;

import no.priv.bang.modeler.core.gef.editor.StringEditorInput;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

public class OpenGefEditorAction implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;

	public void run(IAction action) {
		try {
			System.out.println("Opening GEF editor");
			String editorId = "no.priv.bang.modeler.core.gef.editor.Editor";
			window.getActivePage().openEditor(new StringEditorInput("Here we can put the connection string for a Neo4J database later"), editorId);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public void init(IWorkbenchWindow window) {
		this.window = window;
	}

}
