class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length() == 1) return  "";
        StringBuilder sb = new StringBuilder(palindrome);
        for(int i=0; i<palindrome.length(); i++){
            if(sb.charAt(i) != 'a'){
                sb.setCharAt(i, 'a');
                break;
            }
        }
        return sb.toString();
    }
}