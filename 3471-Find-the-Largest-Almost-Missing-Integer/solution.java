class Solution {
    public int largestInteger(int[] nums, int k) {
        int freqMap[] = new int[100], n = nums.length;
        for(int num:nums){
            freqMap[num]++;
        }
        int ans = -1;
        for(int i=0; i<n; i++){
            if((k==n) || ((freqMap[nums[i]] == 1) && (k == 1 || i == 0 || i==n-1))){
                ans = Math.max(ans, nums[i]);
            }
        }
        return ans;
    }
}