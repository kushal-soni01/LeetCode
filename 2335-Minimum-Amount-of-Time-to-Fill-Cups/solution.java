class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b, a));
        for(int cups: amount){
            if (cups!=0) maxHeap.offer(cups);
        }
        int seconds = 0;
        while(maxHeap.size()>1){
            int max = maxHeap.poll();
            int secondMax = maxHeap.poll();
            if(max!=1) maxHeap.offer(max-1);
            if(secondMax!=1) maxHeap.offer(secondMax-1);
            seconds++;
        }
        if(!maxHeap.isEmpty()) seconds+=maxHeap.poll();
        return seconds;
    }
}

// 1 4 2
// 0 3 2
// 0 2 1
// 0 1 0
// 0 0 0

// 5 4 4
// 4 3 4 | 4 4 3 (Peak-1; Next Peak-1)
// 3 2 4 | 3 3 3 (Peak-1; Next Peak-1)
// 2 1 4 | 2 2 3 (Peak-1; Next Peak-1) 
// 1 0 4 | 2 1 2 (Peak-1; Next Peak-1)
// 0 0 3 | 1 1 1 (Peak-1; Next Peak-1)
// 0 0 2 | 0 0 1 (Peak-1; Next Peak-1)
// 0 0 1 | 0 0 0
// 0 0 0 | 