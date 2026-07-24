class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, i = 0, j = n-1, k=n-1;
        int ans[] = new int[n];
        while(k>=0){
            int i2 = nums[i]*nums[i];
            int j2 = nums[j]*nums[j];
            if(i2 <= j2){
                ans[k] = j2;
                k--;
                j--;
            }
            else{
                ans[k] = i2;
                k--;
                i++;
            }
        }
        return ans;
    }
}