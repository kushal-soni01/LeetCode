class Solution {
    public int compress(char[] chars) {
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for(char c: chars){
            if(sb.length() == 0){
                sb.append(c);
            }
            else{
                if(sb.charAt(0) == c) sb.append(c);
                else{
                    chars[idx++] = sb.charAt(0);
                    int length = sb.length();
                    if(length != 1){
                        for(char ch: String.valueOf(length).toCharArray()){
                            chars[idx++] = ch;
                        }
                    }
                    sb.setLength(0);
                    sb.append(c);
                }
            }
        }
        if(sb.length() != 0){
            chars[idx++] = sb.charAt(0);
            int length = sb.length();
            if(length != 1){
                for(char ch: String.valueOf(length).toCharArray()){
                    chars[idx++] = ch;
                }
            }
        }
        return idx;
    }
}