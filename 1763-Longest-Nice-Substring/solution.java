class Solution {
    public boolean isNice(StringBuilder sb){
        for(int i=0; i<sb.length(); i++){
            char c = sb.charAt(i);
            if(c>='A' && c<='Z' && sb.indexOf(String.valueOf((char)(c+' '))) == -1){
                return false;
            }
            else if(c>='a' && c<='z' && sb.indexOf(String.valueOf((char)(c-' '))) == -1){
                return false;
            }
        }
        return true;
    }
    public String longestNiceSubstring(String s) {
        String ans = "";
        char[] sChars = s.toCharArray();
        int n=s.length();
        for(int i=0; i<n-1; i++){
            StringBuilder sb = new StringBuilder(n-i);
            sb.append(sChars[i]);
            for(int j=i+1; j<n; j++){
                sb.append(sChars[j]);
                if(isNice(sb)){
                    ans = ans.length() >= sb.length() ? ans : sb.toString();
                }
            }
        }
        return ans;
    }
}