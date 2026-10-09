class Solution {
    public int minInsertions(String s) {
        int ans=0, open=0, n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '(') open++;
            else{
                if(i < n-1 && s.charAt(i+1) == ')') i++;
                else ans++;
                if(open == 0) ans++;
                else open--;
            }
        }
        ans += open*2;
        return ans;
    }
}