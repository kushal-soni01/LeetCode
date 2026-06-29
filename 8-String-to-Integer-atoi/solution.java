class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        boolean negative = false;
        boolean digits = false;
        for(char c: s.toCharArray()){
            if(!(c>='0'&&c<='9') && digits){
                break;
            }
            if(c==' ') continue;
            if(c=='-'){
                digits=true;
                negative = true;
                continue;
