class Solution {
    public boolean checkValidString(String s) {
        int low=0, high=0, n=s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                low++;
                high++;
            }
            else{
                if(low > 0) low--;
                if(s.charAt(i) == ')') high--;
                else high++;
            }
            if(high < 0) return false;
        }
        return low==0;
    }
}