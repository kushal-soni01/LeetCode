class Solution {
    public boolean isSubsequence(String s, String t) {
        char sChars[] = s.toCharArray(), tChars[] = t.toCharArray();
        int sPtr = 0, tPtr = 0;
        while((sPtr < s.length()) && (tPtr < t.length())){
            if(tChars[tPtr] == sChars[sPtr]) sPtr++;
            tPtr++;
        }
        return sPtr == s.length();
    }
}