class Solution {
    private int MOD = 1000000007;
    public int minimumCost(int[] nums, int k) {
        long costIncrement = 1, cost = 0, resource = k;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= resource){
                resource -= nums[i];
            }
            else{
                long steps = (long)Math.ceil((nums[i]-resource)/(double)k);
                resource = (steps*k + resource - nums[i])%MOD;
                long factor1, factor2;
                if(steps%2==0){
                    factor1 = (steps/2) % MOD;
                    factor2 = (2*costIncrement+steps-1)%MOD;
                }
                else{
                    factor1 = steps % MOD;
                    factor2 = ((2*costIncrement+steps-1)/2) % MOD;
                }
                cost = (cost + (factor1*factor2) % MOD) % MOD;
                costIncrement += steps;

            }
        }
        return (int)cost;
    }
}