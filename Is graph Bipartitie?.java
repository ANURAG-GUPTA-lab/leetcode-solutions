class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];  
        for (int i = 0; i < n; i++) {
            if (colors[i] == 0 && !bfs(graph, colors, i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean bfs(int[][] graph, int[] colors, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        colors[start] = 1;
        while (!queue.isEmpty()) {
            int currVertex = queue.poll();
            for (int neighbor : graph[currVertex]) {
                if (colors[neighbor] == colors[currVertex]) {
                    return false; 
                }
                if (colors[neighbor] == 0) {
                    colors[neighbor] = -colors[currVertex];  
                    queue.offer(neighbor);
                }
            }
        }
        return true;
    }
}
