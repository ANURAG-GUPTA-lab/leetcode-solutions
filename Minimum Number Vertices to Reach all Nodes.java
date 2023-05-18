class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // Create a set to store the vertices
        Set<Integer> data = new HashSet<>();
        for(int i=0; i<n; i++){
            data.add(i);
        }
        // Iterate over the edges
        for(List<Integer> edge:edges){
            int node = edge.get(1);
             // If the second element of the edge (destination vertex) is in the set
            // Remove it from the set since it can be reached by other vertices
            if(data.contains(node)){
                data.remove(node);
            }
        }
           // Convert the set to a list and return the result
        return new ArrayList<>(data); 

    }
}
