class Solution {
    public int maxProduct(int[] nums) {
        // Max Heap of two elements approach ===>

        // PriorityQueue<Integer> maxHeap = new PriorityQueue<>(2, (a, b) -> b-a);
        // for(int num: nums){
        //     maxHeap.offer(num);
        // }
        // return (maxHeap.poll()-1)*(maxHeap.poll()-1);

        //Linear Approach ===>
        int[] max = new int[2];
        for(int num: nums){
            if(num >= max[0]){
                max[1] = max[0];
                max[0] = num;
            }
            else if(num > max[1] && num < max[0]){
                max[1] = num;
            }
        }
        return (max[0]-1)*(max[1]-1);
    }
}