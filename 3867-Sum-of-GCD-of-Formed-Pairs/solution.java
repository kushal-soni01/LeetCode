class Solution {
    public long gcd(long greater, long lesser){
        if(lesser == 0) return greater;
        return gcd(lesser, greater%lesser);
    }

    public long gcdSum(int[] nums) {
        int n = nums.length, maxEle = 0;
        long gcdPairs[] = new long[n];

        for(int i=0; i<n; i++){
            maxEle = Math.max(maxEle, nums[i]);
            gcdPairs[i] = gcd(maxEle, nums[i]);
        }

        Arrays.sort(gcdPairs);

        int left = 0, right = n-1;
        long prefixGcd = 0;

        while(left<right){
            prefixGcd+=gcd(gcdPairs[right], gcdPairs[left]);
            left++;
            right--;
        }
        
        return prefixGcd;
    }
}