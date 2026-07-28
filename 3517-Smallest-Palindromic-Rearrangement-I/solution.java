class Solution {
    public String smallestPalindrome(String s) {
        int freqMap[] = new int[26];
        for(char c: s.toCharArray()){
            freqMap[c-'a']++;
        }
        char odd = '@';
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<26; i++){
            sb.append(String.valueOf((char)('a' + i)).repeat(freqMap[i]/2));
            if(freqMap[i]%2 == 1){
                odd = (char)('a' + i);
            }
        }
        StringBuilder left = new StringBuilder(sb);
        if(odd != '@') left.append(odd);
        return left.toString() + sb.reverse().toString();
    }
}