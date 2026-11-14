public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if (i == j) {
            return 0;
        }

        boolean[] visited = new boolean[m.length];
        int[] queue = new int[m.length];
        int head = 0;
        int tail = 0;
        int distance = 0;

        visited[i] = true;
        queue[tail++] = i;

        while (head < tail) {
            int levelEnd = tail;
            distance++;

            while (head < levelEnd) {
                int vertex = queue[head++];
                for (int neighbor = 0; neighbor < m[vertex].length; neighbor++) {
                    if (m[vertex][neighbor] != 0 && !visited[neighbor]) {
                        if (neighbor == j) {
                            return distance;
                        }
                        visited[neighbor] = true;
                        queue[tail++] = neighbor;
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
