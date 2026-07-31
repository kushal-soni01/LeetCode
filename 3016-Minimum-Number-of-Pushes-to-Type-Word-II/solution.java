class Solution {
    public int minimumPushes(String word) {
        int freqMap[] = new int[26];
        for(char c: word.toCharArray()){
            freqMap[c-'a']++;
        }
        Arrays.sort(freqMap);
        int ans = 0;
        for(int i=25; i>=0; i--){
            if(freqMap[i] == 0) break;
            ans += freqMap[i]*((25-i)/8 + 1);
        }
        return ans;
    }
}