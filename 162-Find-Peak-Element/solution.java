class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length, low = 0, high = n-1;;
        if(n == 1) return 0;
        while(low <= high){
            int mid = low + (high-low)/2;

            int  left = Integer.MIN_VALUE;
            int right = Integer.MIN_VALUE;

            if(mid == 0) right = nums[mid+1];
            else if(mid == n-1) left = nums[mid-1];
            else {
                left = nums[mid-1];
                right = nums[mid+1];
            }

            if(nums[mid] > left && nums[mid] > right){
                return mid;
            }

            else if(left > nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}