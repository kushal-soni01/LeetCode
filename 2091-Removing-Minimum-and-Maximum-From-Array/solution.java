class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int mxIdx = 0, mnIdx = 0, n = nums.length;
        if(n == 1) return 1;
        for(int i = 0; i<n; i++){
            if(nums[i] > max){
                max = nums[i];
                mxIdx = i;
            }
            if(nums[i] < min){
                min = nums[i];
                mnIdx = i;
            }
        }
        int mx = Math.max(mxIdx, mnIdx), mn = Math.min(mnIdx, mxIdx);
        int both = mn + (n-mx) + 1;
        return Math.min(both, Math.min(mx+1, n-mn));
    }
}