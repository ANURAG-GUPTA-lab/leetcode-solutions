class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
          List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            double prob = succProb[i];
            graph.get(a).add(new Pair(b, prob));
            graph.get(b).add(new Pair(a, prob));
        }
        
        double[] dist = new double[n];
        dist[start] = 1.0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> Double.compare(b.prob, a.prob));
        pq.offer(new Pair(start, 1.0));
        
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            
            if (curr.node == end) {
                return dist[end];
            }
            
            for (Pair neighbor : graph.get(curr.node)) {
                double newProb = dist[curr.node] * neighbor.prob;
                if (newProb > dist[neighbor.node]) {
                    dist[neighbor.node] = newProb;
                    pq.offer(new Pair(neighbor.node, newProb));
                }
            }
        }
        
        return 0.0;
         }
    
    private class Pair {
        int node;
        double prob;
        
        public Pair(int node, double prob) {
            this.node = node;
            this.prob = prob;
        }
    }
}
