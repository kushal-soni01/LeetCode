class Solution {
    public static final int MOD = (int)(1e9 + 7);
    public int distinctSubseqII(String s) {
        int total = 0;
        int dp[] = new int[26];

        for(char c: s.toCharArray()){
            c -= 'a';

            int val = (total - dp[c] + MOD) % MOD;
            dp[c] = 1 + total;
            total = (dp[c] + val)%MOD;
        }
        return total;
    }
}