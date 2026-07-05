class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<k-1; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        for(int i=k-1; i<n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            PriorityQueue<int[]> xMaxHeap = new PriorityQueue<>((a, b) ->{
                return a[0] == b[0] ? Integer.compare(a[1], b[1]) : Integer.compare(a[0], b[0]);
            }); //[occurances, value]
            for(int num: map.keySet()){
                xMaxHeap.offer(new int[] {map.get(num), num});
                if(xMaxHeap.size()>x) xMaxHeap.poll();
            }
            int sum = 0;
            while(!xMaxHeap.isEmpty()){
                int[] data = xMaxHeap.poll();
                sum+=data[0]*data[1];
            }
            ans[i-k+1] = sum;
            int start = nums[i-k+1];
            if(map.get(start) == 1) map.remove(start);
            else map.put(start, map.get(start)-1);
        }
        return ans;
    }
}