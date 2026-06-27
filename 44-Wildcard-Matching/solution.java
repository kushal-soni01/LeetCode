class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        if(s.equals(p)) return true;
        char a[] = s.toCharArray(), b[] = p.toCharArray();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int j=1; j<n+1; j++){
            if(b[j-1] == '*') dp[j] = dp[j-1];
        }
        for(int i=1; i<m+1; i++){
            boolean prev = false;
            if(i==1) prev = true;
            for(int j=1; j<n+1; j++){
                boolean temp = dp[j];
                if(b[j-1] == '?' || a[i-1] == b[j-1]){
                    dp[j] = prev;
                }
                else if(b[j-1] == '*'){
                    dp[j] = dp[j] || dp[j-1];
                }
