class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(k, (a,b) -> Integer.compare(b[0], a[0]));
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num: nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for(int key: freqMap.keySet()){
            maxHeap.offer(new int[]{freqMap.get(key), key});
        }
        int ans[] = new int[k];
        for(int i=0; i<k; i++){
            ans[i] = maxHeap.poll()[1];
        }
        return ans;
    }
}