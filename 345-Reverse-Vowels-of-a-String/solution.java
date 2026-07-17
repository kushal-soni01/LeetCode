class Solution {
    public boolean isVowel(char c){
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        char sChars[] = s.toCharArray();
        int left = 0, right = s.length()-1;
        while(left<right){
            if(isVowel(sChars[left]) && isVowel(sChars[right])){
                char temp = sChars[left];
                sChars[left++] = sChars[right];
                sChars[right--] = temp;
            }
            else if(!isVowel(sChars[left])){
                left++;
            }
            else if(!(isVowel(sChars[right]))){
                right--;
            }
        }
        return String.valueOf(sChars);
    }
}