class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(int key: freqMap.keySet()){
            minHeap.offer(new int[]{freqMap.get(key), key});
            if(minHeap.size()>k) minHeap.poll();
        }
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = minHeap.poll()[1];
        }
        return ans;
    }
}