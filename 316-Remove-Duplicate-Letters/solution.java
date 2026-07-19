class Solution {
    public String removeDuplicateLetters(String s) {
        int freqMap[] = new int[26];
        char sChars[] = s.toCharArray();
        for(char c: sChars){
            freqMap[c-'a']++;
        }
        Stack<Character> stack = new Stack<>();
        boolean used[] = new boolean[26];
        for(char c: sChars){
            freqMap[c-'a']--;
            if(used[c-'a']) continue;
            while(!(stack.isEmpty()) && (stack.peek() >= c) && (freqMap[stack.peek()-'a'] > 0)){
                used[stack.pop()-'a'] = false; 
            }
            used[c-'a'] = true;
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: stack){
            sb.append(c);
        }
        return sb.toString();
    }
}