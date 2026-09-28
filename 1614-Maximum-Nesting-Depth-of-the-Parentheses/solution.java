class Solution {
    public int maxDepth(String s) {
        int ans = 0, n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                int count = 1;
                int j = i+1;
                while(j<n && count != 0){
                    if(s.charAt(j) == ')'){
                        ans = Math.max(ans, count);
                        count--;
                    }
                    else if(s.charAt(j) == '('){
                        count++;
                    }
                    j++;
                }
                i=j;
            }
        }
        return ans;
    }
}