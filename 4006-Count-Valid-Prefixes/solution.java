class Solution {
    public int countValidPrefixes(String s) {
        int ans = 0, zeroes = 0, ones = 0;
        for(char c: s.toCharArray()){
            if(c == '0') zeroes++;
            else ones++;
            if(Math.abs(zeroes-ones) < 2) ans++;
        }
        return ans;
    }
}