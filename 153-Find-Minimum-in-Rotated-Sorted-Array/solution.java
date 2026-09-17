class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length-1, ans = Integer.MAX_VALUE;
        if(left == right) return nums[0];
        while(left<right){
            int mid = left + (right-left)/2;
            ans = Math.min(ans, Math.min(nums[mid], Math.min(nums[left], nums[right])));
            if(nums[mid] >= nums[left]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }
}