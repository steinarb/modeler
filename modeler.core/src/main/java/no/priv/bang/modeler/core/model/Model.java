package no.priv.bang.modeler.core.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	List<Node> nodes = new ArrayList<Node>();
	
	public Model() {
		for (int i = 0; i < 10; i++) {
			Node node = new Node("Node " + i );
			nodes.add(node);
		}
		 
		//set the connection here
		for (int i = 0; i < 10 - 1; i++) {
			Connection connection = new Connection();
 
			connection.setSource(nodes.get(i));
			connection.setTarget(nodes.get(i + 1));
 
			nodes.get(i).addSourceConnection(connection);
			nodes.get(i + 1).addTargetConnection(connection);
		}
 	}

	public List<Node> getNodes() {
		return nodes;
	}

}
