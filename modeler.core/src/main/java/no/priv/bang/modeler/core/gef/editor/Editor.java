package no.priv.bang.modeler.core.gef.editor;

import no.priv.bang.modeler.core.gef.mvc.GraphicalPartFactory;
import no.priv.bang.modeler.core.model.Model;
import no.priv.bang.modeling.modelstore.Modelstore;

import javax.inject.Inject;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.ui.parts.GraphicalEditorWithFlyoutPalette;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;

public class Editor extends GraphicalEditorWithFlyoutPalette {

    private Modelstore modelstore;

    public Editor() {
        setEditDomain(new DefaultEditDomain(this));
    }

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        super.init(site, input);
    }

    @Override
    protected void configureGraphicalViewer() {
        super.configureGraphicalViewer();
        System.out.println("Configuring the GEF editor");

        GraphicalViewer graphicalViewer = getGraphicalViewer();
        graphicalViewer.setRootEditPart(new ScalableRootEditPart());
        graphicalViewer.setEditPartFactory(new GraphicalPartFactory());
        graphicalViewer.setContents(new Model());
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

    @Inject
    public void setModelstore(Modelstore store) {
        modelstore = store;
        System.out.println("Editor: A Modelstore has been injected");
    }

}
