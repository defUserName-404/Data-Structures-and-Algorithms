package grokking_algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BreathFirstSearchTest {

    @Test
    void testPathFound() {
        int[][] graph = {
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertTrue(bfs.isPathFound()); // Path exists from 0 to 4
    }

    @Test
    void testNoPath() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertFalse(bfs.isPathFound()); // No path exists
    }

    @Test
    void testMultiplePaths() {
        int[][] graph = {
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertTrue(bfs.isPathFound()); // Multiple paths from 0 to 3
    }

    @Test
    void testSingleNode() {
        int[][] graph = {
                {0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertTrue(bfs.isPathFound()); // Start is the same as end
    }

    @Test
    void testDisconnectedGraph() {
        int[][] graph = {
                {0, 1},
                {0, 0},
                {0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertFalse(bfs.isPathFound()); // No path from 0 to 2
    }

    @Test
    void testGetShortestPath() {
        int[][] graph = {
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertArrayEquals(new int[]{0, 1, 2, 3, 4}, bfs.getShortestPath()); // Path from 0 to 4
    }

    @Test
    void testGetShortestPathNoPath() {
        int[][] graph = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertNull(bfs.getShortestPath()); // No path exists
    }

    @Test
    void testGetShortestPathMultiplePaths() {
        int[][] graph = {
                {0, 1, 1, 0},
                {0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertArrayEquals(new int[]{0, 1, 3}, bfs.getShortestPath()); // Shortest path from 0 to 3
    }

    @Test
    void testGetShortestPathSingleNode() {
        int[][] graph = {
                {0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertArrayEquals(new int[]{0}, bfs.getShortestPath()); // Start is the same as end
    }

    @Test
    void testGetShortestPathDisconnectedGraph() {
        int[][] graph = {
                {0, 1},
                {0, 0},
                {0, 0}
        };
        BreathFirstSearch bfs = new BreathFirstSearch(graph);
        assertNull(bfs.getShortestPath()); // No path from 0 to 2
    }
}