class Solution {
    public void generate(int open, int close, String s, List<String> ans){
        if(close == 0){
            ans.add(s);
            return;
        }
        if(open == 0) generate(open, close-1, s + ')', ans);
        else if(open < close){
            generate(open-1, close, s+'(', ans);
            generate(open, close-1, s+')', ans);
        }
        else generate(open-1, close, s+'(', ans);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(n, n, "", ans);
        return ans;
    }
}