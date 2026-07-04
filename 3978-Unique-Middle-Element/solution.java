class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.get(nums[nums.length/2]) == 1;
    }
}