public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        /*
         * Finds the shortest path between two nodes in a graph represented as an adjacency matrix, using a breadth-first search (BFS) approach.
         * @param m The adjacency matrix representing the graph.
         * @param i The starting node.
         * @param j The target node.
         * @return The shortest distance between i and j, or -1 if no path exists.
         */
        if (i == j) {
            return 0;
        }

        boolean[] visited = new boolean[m.length];
        int[] queue = new int[m.length];
        int head = 0;
        int tail = 0;
        int distance = 0;

        visited[i] = true;
        queue[tail] = i;
        tail++;

        while (head < tail) {
            int levelEnd = tail;
            distance++;

            while (head < levelEnd) {
                int vertex = queue[head];
                head++;
                for (int neighbor = 0; neighbor < m[vertex].length; neighbor++) {
                    if (m[vertex][neighbor] != 0 && !visited[neighbor]) {
                        if (neighbor == j) {
                            return distance;
                        }
                        visited[neighbor] = true;
                        queue[tail] = neighbor;
                        tail++;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}
