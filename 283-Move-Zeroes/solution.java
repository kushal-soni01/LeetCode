class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for(int right = 1; right<nums.length; right++){
            if(nums[left] == 0){
                while((right<nums.length) && (nums[right] == 0)){
                    right++;
                }
                if(right<nums.length){
                    nums[left++] = nums[right];
                    nums[right] = 0;
                }
            }
            else{
                left++;
            }
        }
        return;
    }
}