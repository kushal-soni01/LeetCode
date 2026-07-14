class Solution {
    public void subsetOR(int[] nums, int idx, int currOR, int maxOR,  int[] ans){
        if(idx == nums.length){
            if(currOR==maxOR){
                ans[0]++;
            }
            return;
        }
        subsetOR(nums, idx+1, currOR | nums[idx], maxOR, ans);
        subsetOR(nums, idx+1, currOR, maxOR, ans);
    }

    public int countMaxOrSubsets(int[] nums) {
        int maxBitwiseOR = 0;
        for(int i:nums){
            maxBitwiseOR |= i;
        }
        int[] ans = {0};
        subsetOR(nums, 0, 0, maxBitwiseOR, ans);
        return ans[0];
    }
}
