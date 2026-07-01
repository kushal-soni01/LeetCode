class Solution {
    public int findMax(int[][] grid, int i, int j){
        int max = 0;
        for(int x=i; x<i+3; x++){
            for(int y=j; y<j+3; y++){
                max = Math.max(max, grid[x][y]);
            }
        }
        return max;
    }
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int ans[][] = new int[n-2][n-2];
        for(int i=0; i<=n-3; i++){
            for(int j=0; j<=n-3; j++){
                ans[i][j] = findMax(grid, i, j);
            }
        }
        return ans;
    }
}