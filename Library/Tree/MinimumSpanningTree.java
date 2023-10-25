import java.util.Arrays;

/*
?	Prim's algorithm to find the minimum spanning tree
!	We start from one vertex and keep adding edges with the lowest weight until we reach our goal.
*	The steps for implementing Prim's algorithm are as follows:
*	- Initialize the minimum spanning tree with a vertex chosen at random.
*	- Find all the edges that connect the tree to new vertices, find the minimum and add it to the tree
*	- Keep repeating step 2 until we get a minimum spanning tree
*/
public class MinimumSpanningTree {

	private final int[][] graph;

	public MinimumSpanningTree(int[][] graph) {
		this.graph = graph;
	}

	public int getMinimumSpanningTree() {
		int noOfEdges = 0;
		int noOfVertices = graph.length;
		int count = 0;
		boolean[] selected = new boolean[noOfVertices];
		Arrays.fill(selected, false);

		selected[0] = true;

		while (noOfEdges < noOfVertices - 1) {
			int min = Integer.MAX_VALUE;
			int x = 0;
			int y = 0;

			for (int i = 0; i < noOfVertices; i++) {
				if (selected[i]) {
					for (int j = 0; j < noOfVertices; j++) {
						if (!selected[j] && graph[i][j] != 0) {
							if (min > graph[i][j]) {
								min = graph[i][j];
								x = i;
								y = j;
							}
						}
					}
				}
			}
			
			count += min;
			selected[y] = true;
			noOfEdges++;
		}

		return count;
	}
}