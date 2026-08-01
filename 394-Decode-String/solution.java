class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;

        for(char c: s.toCharArray()){
            if(c>='0' && c<='9') num = num*10 + (c-'0');
            else if(c == '['){
                numStack.push(num);
                strStack.push(sb);
                num = 0;
                sb = new StringBuilder();
            }
            else if(c == ']'){
                int count = numStack.pop();
                StringBuilder decode = strStack.pop();
                for(int i=0; i<count; i++){
                    decode.append(sb);
                }
                sb = decode;
            }
            else sb.append(c);
        }
        
        return sb.toString();
    }
}