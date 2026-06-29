class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }
        for(int i: freq.keySet()){
            if(freq.containsKey(i+1)){
                ans = Math.max(ans, freq.get(i) + freq.get(i+1));
            }
        }
        return ans;
    }
}