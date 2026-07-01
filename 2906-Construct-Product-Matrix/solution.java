class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length, mul = 1;
        int ans[][] = new int[m][n];
        for(int[] row: ans){
            Arrays.fill(row, 1);
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[i][j] = mul;
                mul = (mul*(grid[i][j]%12345))%12345;
            }
        }
        mul = 1;
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                ans[i][j] = (ans[i][j]*mul)%12345;
                mul = (mul*(grid[i][j]%12345))%12345;
            }
        }
        return ans;
    }
}