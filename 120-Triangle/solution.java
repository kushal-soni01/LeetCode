class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] dp = new int[n];
        dp[0] = triangle.get(0).get(0);
        for(int i = 1; i < n; i++){
            List<Integer> row = triangle.get(i);
            for(int j = i; j >= 0; j--){
                if(j == 0){
                    dp[j] = dp[j] + row.get(j);
                }
                else if(j == i){
                    dp[j] = dp[j-1] + row.get(j);
                }
                else{
                    dp[j] = Math.min(dp[j], dp[j-1]) + row.get(j);
                }
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int x : dp){
            ans = Math.min(ans, x);
        }
        return ans;
    }
}