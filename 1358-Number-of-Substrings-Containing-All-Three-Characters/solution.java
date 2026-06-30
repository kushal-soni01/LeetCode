class Solution {
    public int numberOfSubstrings(String s) {
        int[] occurances = {-1, -1, -1};
        int ans = 0, i=0;
        for(char c: s.toCharArray()){
            occurances[c-'a']=i;
            ans += Math.min(occurances[0], Math.min(occurances[1], occurances[2]))+1;
            i++;
        }
        return ans;
    }
}