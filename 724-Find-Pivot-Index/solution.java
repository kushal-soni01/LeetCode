class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for(int num: nums){
            totalSum += num;
        }
        for(int i=0; i<nums.length; i++){
            if((totalSum-nums[i]) == leftSum*2) return i;
            leftSum += nums[i];
        }
        return -1;
    }
}