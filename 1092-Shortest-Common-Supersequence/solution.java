class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        if(str1.equals(str2)) return str1;
        int m = str1.length(), n = str2.length();
        char[] a = str1.toCharArray(), b = str2.toCharArray();
        int dp[][] = new int[m+1][n+1];
        for(int i=1; i<m+1; i++){
            for(int j=1; j<n+1; j++){
                if(a[i-1] == b[j-1]){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        StringBuilder ans = new StringBuilder(m+n-dp[m][n]);
        while(m>0 && n>0){
            if(a[m-1] == b[n-1]){
                ans.append(a[--m]);
                n--;
            }
            else{
                if(dp[m-1][n] > dp[m][n-1]) ans.append(a[--m]);
                else ans.append(b[--n]);
            }
        }
        while(m>0) ans.append(a[--m]);
        while(n>0) ans.append(b[--n]);
        return ans.reverse().toString();
    }
}