class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length, ans = 0;
        long prefixSum[] = new long[n+1];
        prefixSum[0] = 0;
        for(int i=0; i<n; i++){
            prefixSum[i+1] += prefixSum[i] + nums[i];
        }
        for(int i=0; i<n; i++){ 
            long leftSum = 0;
            if(i <= n/2){
                leftSum = prefixSum[i + n/2] - prefixSum[i];
            }
            else{
                leftSum = prefixSum[n] - prefixSum[i] + prefixSum[i-n/2];
            }
            long rightSum = prefixSum[n] - leftSum;
            if(leftSum > rightSum) ans++;
        }
        return ans;
    }
}