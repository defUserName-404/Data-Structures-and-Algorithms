package grokking_algorithms;

import java.util.LinkedList;
import java.util.Queue;

/*
Breadth First Search or BFS for short is a search algorithm for finding the shortest path between two nodes in a graph.
 */
public class BreathFirstSearch {

    private final int[][] graph;

    public BreathFirstSearch(int[][] graph) {
        this.graph = graph;
    }

    public boolean isPathFound() {
        int start = 0;
        int end = graph.length - 1;
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == end) {
                System.out.println("Path found");
                return true;
            }
            for (int i = 0; i < graph[current].length; i++) {
                if (graph[current][i] != 0 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
        }
        System.out.println("Path not found");
        return false;
    }

    public int[] getShortestPath() {
        int start = 0;
        int end = graph.length - 1;
        boolean[] visited = new boolean[graph.length];
        Queue<Integer> queue = new LinkedList<>();
        int[] parent = new int[graph.length];
        queue.offer(start);
        visited[start] = true;
        parent[start] = -1;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == end) {
                System.out.println("Path found");
                return reconstructPath(parent, start, end);
            }
            for (int i = 0; i < graph[current].length; i++) {
                if (graph[current][i] != 0 && !visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                    parent[i] = current;
                }
            }
        }
        System.out.println("Path not found");
        return null;
    }

    private int[] reconstructPath(int[] parent, int start, int end) {
        LinkedList<Integer> path = new LinkedList<>();
        for (int at = end; at != -1; at = parent[at]) {
            path.addFirst(at);
        }
        return path.stream().mapToInt(i -> i).toArray();
    }
}
