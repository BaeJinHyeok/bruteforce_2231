import java.util.*;

public class DijkstraAlgorithm {
    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        for (int i = 0; i < n - 1; i++) {
            int minDist = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && distance[j] < minDist) {
                    minDist = distance[j];
                    minIndex = j;
                }
            }

            visited[minIndex] = true;

            for (int j = 0; j < n; j++) {
                if (!visited[j] && graph[minIndex][j] != 0 && distance[minIndex] != Integer.MAX_VALUE &&
                        distance[minIndex] + graph[minIndex][j] < distance[j]) {
                    distance[j] = distance[minIndex] + graph[minIndex][j];
                }
            }
        }

        // Print the shortest distances
        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from source to " + i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 4, 0, 0, 0, 0, 0, 8, 0},
                {4, 0, 8, 0, 0, 0, 0, 11, 0},
                {0, 8, 0, 7, 0, 4, 0, 0, 2},
                {0, 0, 7, 0, 9, 14, 0, 0, 0},
                {0, 0, 0, 9, 0, 10, 0, 0, 0},
                {0, 0, 4, 14, 10, 0, 2, 0, 0},
                {0, 0, 0, 0, 0, 2, 0, 1, 6},
                {8, 11, 0, 0, 0, 0, 1, 0, 7},
                {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        dijkstra(graph, 0);
    }
}