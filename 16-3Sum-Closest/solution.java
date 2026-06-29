class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int left = i+1, right = nums.length-1;
            while(left<right){
                int currSum = nums[i] + nums[left] +  nums[right];
                int currDiff = Math.abs(target-currSum);
                if(currSum==target) return target;
                else if(currSum < target) left++;
                else right --;
                if(currDiff<diff){
