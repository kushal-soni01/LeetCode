class Solution {
    public int playGame(int[] nums, int left, int right, Integer dp[][]){
        if(left == right) return nums[left];
        if(dp[left][right] != null) return dp[left][right];
        dp[left][right] = Math.max((nums[left] - playGame(nums, left+1, right, dp)), (nums[right] - playGame(nums, left, right-1, dp)));
        return dp[left][right];
    }
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        Integer dp[][] = new Integer[n][n];
        return n%2 == 0 ? true : playGame(nums, 0, n-1, dp) >= 0;
    }
}