class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1 || obstacleGrid[rows-1][cols-1] == 1){
            return 0;
        }
        boolean obstacle = false;
        for(int row=0; row<rows; row++){
            if(obstacleGrid[row][0]==0 && !obstacle){
                obstacleGrid[row][0] = 1;
            }
            else{
                obstacle = true;
                obstacleGrid[row][0] = 0;
            }
        }
        obstacle = false;
        for(int col=1; col<cols; col++){
            if(obstacleGrid[0][col]==0 && !obstacle){
                obstacleGrid[0][col] = 1;
            }
            else{
                obstacle = true;
                obstacleGrid[0][col] = 0;
            }
        }
        for(int i=1; i<rows; i++){
            for(int j=1; j<cols; j++){
                if(obstacleGrid[i][j] == 0){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
                else{
                    obstacleGrid[i][j] = 0;
                }
            }
        }
        return obstacleGrid[rows-1][cols-1];
    }
}