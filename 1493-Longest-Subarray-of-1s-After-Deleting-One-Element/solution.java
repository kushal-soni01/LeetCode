class Solution {
    public int longestSubarray(int[] nums) {
        int start=0, end=0, zero=0, ans=0;
        while(end<nums.length){
            if(nums[end]==0) zero++;
            if(zero<=1){
                end++;
            }
            else{
                while(start<=end && nums[start]!=0){
                    start++;
                }
                start++;
                zero--;
                end++;
            }
            ans=Math.max(ans, end-start);
        }
        return ans-1;
    }
}