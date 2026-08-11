class Solution {
    public int missingInteger(int[] nums) {
        boolean present[] = new boolean[52];
        int sum = nums[0];
        for(int num: nums){
            present[num] = true;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1) sum+=nums[i];
            else break;
        }
        if(sum > 50) return sum;
        for(int i=sum; i<52; i++){
            if(present[i] == false){
                return i;
            }
        }
        return sum;
    }
}