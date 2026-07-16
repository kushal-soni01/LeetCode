class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        StringBuilder sb = new StringBuilder(m+n);
        int i = 0, j = 0;
        while(i<m && j<n){
            sb.append(String.valueOf(word1.charAt(i++)) + word2.charAt(j++));
        }
        if(i<m){
            sb.append(word1.substring(i));
        }
        else if(j<n){
            sb.append(word2.substring(j));
        }
        return sb.toString();
    }
}