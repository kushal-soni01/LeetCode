class Solution {
    public int minInsertions(String s) {
        int m = s.length();
        char a[] = s.toCharArray();
        int dp[] = new int[m+1];
        for(int i=1; i<m+1; i++){
            int prev = 0;
            for(int j=1; j<m+1; j++){
                int temp = dp[j];
                if(a[i-1] == a[m-j]){
                    dp[j] = 1 + prev;
                }
                else{
                    dp[j] = Math.max(dp[j], dp[j-1]);
                }
                prev = temp;
            }
        }
        return m-dp[m];
    }
}