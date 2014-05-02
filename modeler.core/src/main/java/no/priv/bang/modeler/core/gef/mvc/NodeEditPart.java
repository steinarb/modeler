package no.priv.bang.modeler.core.gef.mvc;

import java.util.List;

import no.priv.bang.modeler.core.model.Node;

import org.eclipse.draw2d.ChopboxAnchor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Color;

public class NodeEditPart extends AbstractGraphicalEditPart {

	private ChopboxAnchor m_anchor;

	@Override
	protected IFigure createFigure() {
		System.out.println("Called HelloEditPart.createFigure()");
		IFigure rectangle = new RectangleFigure();
		rectangle.setBackgroundColor(new Color(null, 200, 200, 200));
		m_anchor = new ChopboxAnchor(rectangle);
		return rectangle;	}

	@Override
	protected void createEditPolicies() {
		System.out.println("Called HelloEditPart.createEditPolicies()");
	}

	@Override
	protected void refreshVisuals() {
		Node node = (Node)getModel();
		//This is where the actual drawing is done,
		// Simply a rectangle with text
		Rectangle bounds = new Rectangle(50, 50, 50, 50);
		getFigure().setBounds(bounds);
		Label label = new Label(node.getLabel());
		label.setTextAlignment(PositionConstants.CENTER);
		label.setBounds(bounds.crop(IFigure.NO_INSETS));
		getFigure().add(label);
	}

	@Override
	protected ConnectionEditPart createConnection(Object model) {
		NodeConnectionEditPart connectPart = (NodeConnectionEditPart) getRoot()
				.getViewer().getEditPartRegistry().get(model);
		if (connectPart == null) {
			connectPart = new NodeConnectionEditPart();
			connectPart.setModel(model);
		}
		return connectPart;
	}

	@Override
	protected List getModelSourceConnections() {
		List 	sourceConnections = ((Node) getModel()).getSourceConnections();
		return sourceConnections;
	}

	@Override
	protected List getModelTargetConnections() {
		List targetConnection = ((Node) getModel()).getTargetConnections();
		return targetConnection;	}

}
