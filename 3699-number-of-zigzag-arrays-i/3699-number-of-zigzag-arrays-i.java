class Solution {
    private int MOD = 1000000000 + 7;
    public int zigZagArrays(int n, int l, int r) {
        int dp[] = new int[r+1];
        for(int i=l; i<r+1; i++){
            dp[i] = 1;
        }
        for(int i=2; i<n+1; i++){
            int prefix[] = new int[r+1];

            for(int j=l; j<r+1; j++){
                prefix[j] = (prefix[j-1] + dp[j])%MOD;
            }

            for(int j=l; j<r+1; j++){
                dp[j] = (prefix[r] - prefix[r-j+l]+MOD)%MOD;
            }
        }
        int ans = 0;
        for(int i=l; i<r+1; i++){
            ans = (ans+dp[i])%MOD;
        }
        return n==1 ? ans : (ans*2)%MOD;
    }
}