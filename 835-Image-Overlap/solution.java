class Solution {
    public int largestOverlap(int[][] img1, int[][] img2) {
        int n = img1.length, ans = 0;
        for(int x = -n+1; x < n; x++){
            for(int y = -n+1; y<n; y++){
                int score = 0;
                for(int i=0; i<n; i++){
                    for(int j=0; j<n; j++){
                        if(x + i >= 0 && x+i < n && y+j >= 0 && y+j < n){
                            score += img1[x+i][y+j] & img2[i][j];
                        }
                    }
                }
                ans = Math.max(ans, score);
            }
        }
        return ans;
    }
}