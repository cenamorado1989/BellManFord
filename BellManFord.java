// Christian Enamorado
// 11/30/2018
// Bellman Ford
public class BellManFord {
	public static void main(String[] args) {
		int graph[][] = { { 0, 2, 0, 5, 0}, {2, 0, 14, 5, 4}, { 0, 14, 0, 0, 34}, {5, 5, 0, 0, 58}, {0, 4, 34, 58, 0}};
		shortPaths(graph, 2);// This is where you can choose the starting vertex
		}
	public static void shortPaths(int graph[][], int src) {
		int dist[] = new int[graph.length];// shortest distance array
		Boolean visited[] = new Boolean[graph.length];//List of visited nodes
		
		for(int i = 0; i < graph.length; i++){
			dist[i] = Integer.MAX_VALUE; // Fills array with infinite values
			visited[i] = false;// sets all visited nodes to false
		}
		dist[src] = 0;
		
		for(int j = 0; j < graph.length; j++) {
		for(int i = 0; i < graph.length; i++) {// if distance to current node plus distance to other is less than whats in distance vector
			if(graph[src][i] > 0 && graph[src][i] < Integer.MAX_VALUE && (graph[src][i] + dist[src]) < dist[i]) {
				dist[i] = graph[src][i] + dist[src];
				}
			}
		visited[src] = true;
		int index = 0;
		for(int x = 0; x < dist.length; x++) {
			int min = Integer.MAX_VALUE;
			if(dist[x] < min && !(dist[x] <= 0) && visited[x] != true) {
				min = dist[x];
				index = x;
				}
			}
			src = index;
		}
		
		for(int x = 0; x < dist.length; x++) {
			System.out.print(dist[x] + " ");
			
		}
		System.out.println();	
		
	}
}
