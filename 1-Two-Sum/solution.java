class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int c = target - nums[i];
            if (freqMap.containsKey(c)){
                return new int[] {freqMap.get(c), i};
            }
            freqMap.put(nums[i], i);
        }
        return new int[] {};
    }
}