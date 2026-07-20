class Solution {
    public int longestOnes(int[] nums, int k) {
        if(nums.length==k) return k;
        int start = 0, end = 0, zc=0, ans=0;
        while(start<=end && end<nums.length){
            if(nums[end]==0){
                zc++;
            }
            if(zc>k){
                if(nums[start]==0){
                    zc--;
                }
                start++;
            }
            ans = Math.max(ans, end-start+1);
            end++;
        }
        return ans;
    }
}