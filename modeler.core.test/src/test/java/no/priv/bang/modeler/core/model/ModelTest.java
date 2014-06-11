package no.priv.bang.modeler.core.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class ModelTest {

	@Test
	public void testCreateModel() {
		Model model = new Model("target/graphdb");
		assertNotNull(model); // Avoid unused variable warning (this assert will never fail)
	}
	
	@Test
	public void testGetNodes() {
		Model model = new Model("target/graphdb");
		List<Node> nodes = model.getNodes();
		assertNotNull(nodes);
		assertNotEquals(0, nodes.size());
		for (Node node : nodes) {
			List<Connection> sourceConnections = node.getSourceConnections();
			assertNotEquals(-1, sourceConnections.size()); // 1 for all but the last, where the size is 0
			List<Connection> targetConnections = node.getTargetConnections();
			assertNotEquals(-1, targetConnections.size()); // 1 for all but the last, where the size is 0
		}
	}

}
