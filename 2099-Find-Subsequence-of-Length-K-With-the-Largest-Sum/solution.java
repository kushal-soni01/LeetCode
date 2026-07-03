class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        for(int i=0; i<nums.length; i++){
            heap.offer(new int[] {nums[i], i});
            if(heap.size() > k) heap.poll();
        }
        PriorityQueue<int[]> orderedHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[1], b[1]));
        while(!heap.isEmpty()){
            orderedHeap.offer(heap.poll());
        }
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = orderedHeap.poll()[0];
        }
        return ans;
    }
}