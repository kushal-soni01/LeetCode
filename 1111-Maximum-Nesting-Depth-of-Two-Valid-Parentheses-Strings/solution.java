class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length(), ans[] = new int[n];
        int depth = -1;
        for(int i=0; i<n; i++){
            if(seq.charAt(i) == '('){
                depth++;
                ans[i] = depth % 2;
            }
            else{
                ans[i] = depth % 2;
                depth--;
            }
        }
        return ans;
    }
}