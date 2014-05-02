package no.priv.bang.modeler.core.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class NodeTest {

	/**
	 * The minimal basic test: create an instance of the object.
	 * If the object can be created and doesn't throw any exceptions
	 * in the constructor then the test is a success.
	 */
	@Test
	public void testCreateNode() {
		Node node = new Node("label");
		assertNotNull(node); // Avoid unused variable warning (this assert will never fail)
	}
	
	@Test
	public void testGetLabel() {
		Node node = new Node("Node label");
		String label = node.getLabel();
		assertEquals("Node label", label);
	}
	
	@Test
	public void getSourceConnections() {
		Node node = new Node("Node label");
		List<Connection> connections = node.getSourceConnections();
		assertEquals(0, connections.size());
	}
	
	@Test
	public void getTargetConnections() {
		Node node = new Node("Node label");
		List<Connection> connections = node.getTargetConnections();
		assertEquals(0, connections.size());
	}

}
