class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length, sfx[] = new int[n], mn = Integer.MAX_VALUE, mx = 0;
        for(int i = n-1; i>=0; i--){
            mn = Math.min(mn, nums[i]);
            sfx[i] = mn;
        }
        for(int i=0; i<n; i++){
            mx = Math.max(nums[i], mx);
            if(mx - sfx[i] <= k) return i;
        }
        return -1;
    }
}