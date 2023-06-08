class Solution {
    public int countNegatives(int[][] grid) {
        int rows = grid.length, columns = grid[0].length;
        
		int i = rows - 1, j = 0;
        int result = 0;

        while(i>=0 && j<columns) {
            if(grid[i][j]<0) {
				i--;                       
				result = result + columns - j;        
            } else {
                j++;                        
            }
        }
        
        return result;
    }
}
