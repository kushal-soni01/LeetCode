class Solution {
    public int split(String s, int start, int end){
        int ans = 0, open = 0;
        for(int i=start; i<end; i++){
            open += s.charAt(i) == '(' ? 1 : -1;
            if(open == 0){
                if(i-start == 1){
                    ans++;
                }
                else{
                    ans += 2*(split(s, start+1, i));
                }
                start = i+1;
            }
        }
        return ans;
    }
    public int scoreOfParentheses(String s) {
        return split(s, 0, s.length());
    }
}