class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] nextOccurance = new int[n], ans = new int[n];
        HashMap<Integer, Integer> occuranceMap = new HashMap<>();
        HashSet<Integer> full = new HashSet<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        for(int i=n-1; i>=0; i--){
            if(rains[i] == 0) continue;
            if(occuranceMap.containsKey(rains[i])) nextOccurance[i] = occuranceMap.get(rains[i]);
            else nextOccurance[i] = n;  
            occuranceMap.put(rains[i], i);
        }
        for(int i=0; i<n; i++){
            if(rains[i] != 0){
                if(full.contains(rains[i])) return new int[]{};
                full.add(rains[i]);
                ans[i] = -1;
                if(nextOccurance[i]!=n) heap.add(new int[]{nextOccurance[i], rains[i]});
            }
            else{
                if(!heap.isEmpty()){
                    int lakeInfo[] = heap.poll();
                    ans[i] = lakeInfo[1];
                    full.remove(ans[i]);
                }
                else{
                    ans[i] = 1;
                }
            }
        }
        return ans;
    }
}