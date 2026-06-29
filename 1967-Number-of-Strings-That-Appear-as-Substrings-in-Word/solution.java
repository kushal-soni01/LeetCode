class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for(String pattern: patterns){
            ans = word.contains(pattern) ? ans+1 : ans;
        }
        return ans;
    }
}