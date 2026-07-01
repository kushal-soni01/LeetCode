class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        for(int[] row: matrix){
            for(int i=0; i<row.length; i++){
                maxHeap.add(row[i]);
                if(maxHeap.size() > k){
                    maxHeap.poll();
                }
            }
        }
        return maxHeap.peek();
    }
}