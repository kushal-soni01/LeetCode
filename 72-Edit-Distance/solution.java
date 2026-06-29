class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        char[] word1Chars = word1.toCharArray(), word2Chars = word2.toCharArray();
        int dp[] = new int[n+1];
        for(int j=1; j<n+1; j++){
            dp[j] = j;
        }
        for(int i=1; i<m+1; i++){
            int prev = i-1;
            dp[0] = i;
            for(int j=1; j<n+1; j++){
                int temp = dp[j];
                if(word1Chars[i-1] == word2Chars[j-1]) dp[j] = prev;
                else dp[j] = 1 + Math.min(prev, Math.min(dp[j], dp[j-1]));
                prev = temp;
            }
        }
        return dp[n];
    }
}