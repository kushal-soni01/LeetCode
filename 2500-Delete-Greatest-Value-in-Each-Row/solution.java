class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length, ans = 0;
        for(int row[]: grid){
            Arrays.sort(row);
        }
        for(int j=n-1; j>=0; j--){
            int maxRowEle = 0;
            for(int i=0; i<m; i++){
                maxRowEle = Math.max(maxRowEle, grid[i][j]);
            }
            ans += maxRowEle;
        }
        return ans;
    }
}