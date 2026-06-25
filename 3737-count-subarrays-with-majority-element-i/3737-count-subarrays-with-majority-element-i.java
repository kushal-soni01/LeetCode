class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int sum = 0, n = nums.length, ans = 0;
        for(int i=0; i<n; i++){
            sum += (nums[i] == target) ? 1 : -1;
            nums[i] = sum;
        }
        for(int i=0; i<n; i++){
            if(nums[i]>0) ans++;
            for(int j=i; j<n; j++){
                if(nums[j] - nums[i] > 0){
                    ans++;
                }
            }
        }
        return ans;
    }
}