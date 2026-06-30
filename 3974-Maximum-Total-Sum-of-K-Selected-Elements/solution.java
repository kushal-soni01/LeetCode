class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ans = 0;
        Arrays.sort(nums);
        int used = 0;
        for(int i = nums.length-1; i>=0 && used<k; i--){
            ans += (long)nums[i]*mul;
            if(mul>1) mul--;
            k--;
        }
        return ans;
    }
}