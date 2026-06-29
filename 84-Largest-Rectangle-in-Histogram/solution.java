class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] prev = new int[n];
        int[] next = new int[n];
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                prev[i] = -1;
            }
            else{
                prev[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i] = n;
            }
            else{
                next[i] = stack.peek();
            }
            stack.push(i);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(ans, heights[i] * (next[i]-prev[i]-1));
        }
        return ans;
    }
}