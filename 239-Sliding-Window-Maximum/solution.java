class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int ans[] = new int[n-k+1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for(int i=0; i<k; i++){
            while(!deque.isEmpty() && deque.getFirst() < nums[i]){
                deque.removeFirst();
            }
            deque.addFirst(nums[i]);
        }
        ans[0] = deque.getLast();
        for(int i=k; i<n; i++){
            if(!deque.isEmpty() && deque.getLast() == nums[i-k]){
                deque.removeLast();
            }
            while(!deque.isEmpty() && deque.getFirst() < nums[i]){
                deque.removeFirst();
            }
            deque.addFirst(nums[i]);
            ans[i-k+1] = deque.getLast();
        }
        return ans;
    }
}