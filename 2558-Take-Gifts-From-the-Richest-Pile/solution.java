class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>((a,b) -> Long.compare(b,a));
        for(long gift: gifts){
            maxHeap.offer(gift);
        }
        while(k-->0){
            maxHeap.offer((long)Math.floor(Math.sqrt(maxHeap.poll())));
        }
        long sum = 0;
        while(!maxHeap.isEmpty()){
            sum+=maxHeap.poll();
        }
        return sum;
    }
}

// [25, 64, 9, 4, 100] k = 4;
// [25, 64, 9, 4, 10] k = 3;
// [25, 8, 9, 4, 10] k = 2;
// [5, 8, 9, 4, 10] k = 1;
// [5, 8, 9, 4, 3] k = 0;
