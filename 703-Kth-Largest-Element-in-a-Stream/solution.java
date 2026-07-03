class KthLargest {
    public PriorityQueue<Integer> heap = new PriorityQueue<>();
    int capacity;
    public KthLargest(int k, int[] nums) {
        capacity = k;
        for(int num: nums){
            heap.offer(num);
            if(heap.size()>capacity) heap.poll();
        }
    }
    
    public int add(int val) {
        heap.offer(val);
        if(heap.size()>capacity) heap.poll();
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */