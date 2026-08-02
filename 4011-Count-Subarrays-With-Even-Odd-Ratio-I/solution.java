class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ans = 0, n = nums.length;
        for(int i = 0; i<n; i++){
            int odd = 0, even = 0;
            if(nums[i] %2 == 0) even++;
            else{
                ans++;
                odd++;
            }
            for(int j = i+1; j<n; j++){
                if(nums[j]%2 == 0) even++;
                else odd++;
                if(odd > 0 && ((even*b <= (a*odd)))){
                    ans++;
                }
            }
        }
        return ans;
    }
}