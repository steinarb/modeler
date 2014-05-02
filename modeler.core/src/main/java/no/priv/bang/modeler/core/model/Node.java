package no.priv.bang.modeler.core.model;

import java.util.ArrayList;
import java.util.List;

public class Node {

	private String label;
	private List<Connection> sourceConnections = new ArrayList<Connection>();
	private List<Connection> targetConnections = new ArrayList<Connection>();

	public Node(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public List<Connection> getSourceConnections() {
		return sourceConnections;
	}

	public List<Connection> getTargetConnections() {
		return targetConnections;
	}

	public void addSourceConnection(Connection connection) {
		sourceConnections.add(connection);
	}

	public void addTargetConnection(Connection connection) {
		targetConnections.add(connection);
	}

}
