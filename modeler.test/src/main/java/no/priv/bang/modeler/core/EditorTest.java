package no.priv.bang.modeler.core;

import static org.junit.Assert.*;

import no.priv.bang.modeler.core.gef.editor.Editor;
import no.priv.bang.modeler.core.gef.editor.StringEditorInput;

import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.internal.registry.EditorDescriptor;
import org.junit.Test;

@SuppressWarnings("restriction")
public class EditorTest {

	/**
	 * Verify that finding the GEF editor with the ID, returns
	 * the expected class.
	 */
	@Test
	public void testFindEditorById() {
		String editorId = "no.priv.bang.modeler.core.gef.editor.Editor";
		EditorDescriptor descriptor = (EditorDescriptor) PlatformUI.getWorkbench().getEditorRegistry().findEditor(editorId);
		assertNotNull(descriptor);
		assertEquals(Editor.class.getName(), descriptor.getClassName());
	}

	/**
	 * Open a GEF editor in the same way as the action in the menu.
	 * @throws PartInitException 
	 */
	@Test
	public void testOpenEditorById()
			throws PartInitException 
	{
		String editorId = "no.priv.bang.modeler.core.gef.editor.Editor";
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		IEditorPart editorPart = window.getActivePage().openEditor(new StringEditorInput("Here we can put the connection string for a Neo4J database later"), editorId);
		assertNotNull(editorPart);
	}

}
