class Solution {
    public int maximumLengthSubstring(String s) {
        int freqMap[] = new int[26];
        int i = 0, j = 0, ans = 0;
        while(j < s.length()){
            char c = s.charAt(j);
            while(freqMap[c - 'a'] >= 2){
                freqMap[s.charAt(i++) - 'a']--;
            }
            freqMap[c - 'a']++;
            ans = Math.max(ans, j-i+1);
            j++;
        }
        return ans;
    }
}