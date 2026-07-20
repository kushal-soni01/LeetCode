class Solution {
    public int maxVowels(String s, int k) {
        int vowels = 0;
        char sChars[] = s.toCharArray();
        for(int i=0; i<k; i++){
            if ("aeiou".indexOf(sChars[i]) != -1) vowels++;
        }
        int ans = vowels;
        for(int i=k; i<sChars.length; i++){
            if ("aeiou".indexOf(sChars[i]) != -1) vowels++;
            if ("aeiou".indexOf(sChars[i-k]) != -1) vowels--;
            ans = Math.max(vowels, ans);
        }
        return ans;
    }
}