package no.priv.bang.modeler.core.gef.editor;

import no.priv.bang.modeler.core.gef.mvc.GraphicalPartFactory;
import no.priv.bang.modeler.core.model.Model;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;

public class Editor extends GraphicalEditorWithFlyoutPalette {
	
	public Editor() {
		setEditDomain(new DefaultEditDomain(this));
	}

	@Override
	protected void configureGraphicalViewer() {
		super.configureGraphicalViewer();
		System.out.println("Configuring the GEF editor");
		
		GraphicalViewer graphicalViewer = getGraphicalViewer();
		graphicalViewer.setRootEditPart(new ScalableRootEditPart());
		graphicalViewer.setEditPartFactory(new GraphicalPartFactory());
		graphicalViewer.setContents(new Model(getEditorInput().getName()));
	}

	@Override
	protected PaletteRoot getPaletteRoot() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void doSave(IProgressMonitor monitor) {
		// TODO Auto-generated method stub

	}

}
