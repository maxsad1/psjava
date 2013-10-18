package org.psjava.algo.graph.pathfinder;

import org.junit.Assert;
import org.junit.Test;
import org.psjava.ds.Collection;
import org.psjava.ds.graph.AdjacencyListFromGraph;
import org.psjava.ds.graph.DirectedEdge;
import org.psjava.ds.graph.Graph;
import org.psjava.ds.graph.TestGraphFactory;

public class DFSPathFinderTest {

	@Test
	public void test() {
		Graph<String, DirectedEdge<String>> g = TestGraphFactory.createDirected(new String[][] { { "A", "B" }, { "B", "C" }, { "C", "D" } });
		Collection<DirectedEdge<String>> r = DFSPathFinder.getInstance().find(AdjacencyListFromGraph.create(g), "A", "C", null);
		Assert.assertEquals("(A->B,B->C)", r.toString());
	}

	@Test
	public void testNoPath() {
		Graph<String, DirectedEdge<String>> g = TestGraphFactory.createDirected(new String[][] { { "A", "B" }, { "C", "D" } });
		Collection<DirectedEdge<String>> r = DFSPathFinder.getInstance().find(AdjacencyListFromGraph.create(g), "A", "C", null);
		Assert.assertNull(r);
	}

}