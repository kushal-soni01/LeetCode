class Solution {
    public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public long maxPairStrength(int[] nums) {
        long ans = 0, n = nums.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                ans = Math.max(ans, (long)nums[i]*nums[j]/(long)Math.pow(gcd(nums[i], nums[j]), 2));
            }
        }
        return ans;
    }
}