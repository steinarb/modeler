package no.priv.bang.modeler.core.model;

public class Connection {

	private Node source;
	private Node target;

	public Node getSource() {
		return source;
	}

	public void setSource(Node node) {
		source = node;
	}

	public void setTarget(Node node) {
		target = node;
	}

	public Node getTarget() {
		return target;
	}

}
