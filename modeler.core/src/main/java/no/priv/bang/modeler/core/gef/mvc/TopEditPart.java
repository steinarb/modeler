package no.priv.bang.modeler.core.gef.mvc;


import java.util.List;

import no.priv.bang.modeler.core.model.Model;
import no.priv.bang.modeler.core.model.Node;

import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FreeformLayer;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

public class TopEditPart extends AbstractGraphicalEditPart {

	@Override
	protected IFigure createFigure() {
		Figure f = new FreeformLayer();
		f.setLayoutManager(new FreeformLayout());

		f.setBorder(new MarginBorder(1));
		// Create a layout for the graphical screen
		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 3;
		gridLayout.horizontalSpacing = 40;
		gridLayout.verticalSpacing = 40;
		gridLayout.marginHeight = 20;
		gridLayout.marginWidth = 20;
		f.setLayoutManager(gridLayout);
		f.setOpaque(true);
		return f;
	}

	@Override
	protected void createEditPolicies() {

	}

	protected List<Node> getModelChildren() {
		List<Node> children = ((Model) getModel()).getNodes();
		return children;
	}

}
