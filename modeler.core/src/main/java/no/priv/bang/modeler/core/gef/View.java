package no.priv.bang.modeler.core.gef;

import no.priv.bang.modeler.core.gef.mvc.GraphicalPartFactory;
import no.priv.bang.modeler.core.model.Model;
import no.priv.bang.modeling.modelstore.Modelstore;

import javax.inject.Inject;

import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.FreeformGraphicalRootEditPart;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

public class View extends ViewPart {
    public static final String ID = "GEFModelstore.view";

    // Use a standard viewer for the Draw2d canvas
    private ScrollingGraphicalViewer viewer = new ScrollingGraphicalViewer();

    // Use a standard RootEditPart as holder for all edit parts.
    private RootEditPart rootEditPart = new FreeformGraphicalRootEditPart();

    // Custom made EditPartfactory, will automatically be called to create
    // edit parts for model elements.
    private EditPartFactory editPartFactory = new GraphicalPartFactory();

    private Model model;

    private Modelstore modelstore;

    @Override
    public void createPartControl(Composite parent) {
        // Create a dummy model
        model = new Model();

        // Initialize the viewer, 'parent' is the
        // enclosing RCP windowframe
        viewer.createControl(parent);
        viewer.setRootEditPart(rootEditPart);
        viewer.setEditPartFactory(editPartFactory);

        // Inject the model into the viewer, the viewer will
        // traverse the model automatically
        viewer.setContents(model);

        // Set the view's background to white
        viewer.getControl().setBackground(new Color(null, 255, 255, 255));
    }

    @Override
    public void setFocus() {
        viewer.getControl().setFocus();
    }

    @Inject
    public void setModelstore(Modelstore store) {
        modelstore = store;
        System.out.println("View: A Modelstore has been injected");
    }

}
