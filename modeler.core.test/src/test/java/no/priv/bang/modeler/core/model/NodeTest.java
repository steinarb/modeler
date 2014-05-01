package no.priv.bang.modeler.core.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	/**
	 * The minimal basic test: create an instance of the object.
	 * If the object can be created and doesn't throw any exceptions
	 * in the constructor then the test is a success.
	 */
	@Test
	public void testCreateNode() {
		Node node = new Node();
		assertNotNull(node); // Avoid unused variable warning (this assert will never fail)
	}

}
