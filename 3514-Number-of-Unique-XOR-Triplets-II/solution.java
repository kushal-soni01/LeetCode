class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int max = 0, n = nums.length;
        for(int num: nums) max = Math.max(num, max);
        int len = 2<<(int)(Math.log(max)/Math.log(2));
        
        int doublet[] = new int[len];
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                doublet[nums[i] ^ nums[j]] = 1;
            }
        }

        int triplet[] = new int[len];
        for(int i=0; i<len; i++){
            if(doublet[i] == 0) continue;
            for(int num: nums){
                triplet[num ^ i] = 1;
            }
        }

        int ans = 0;
        for(int i=0; i<len; i++){
            if(triplet[i] == 1) ans++;
        }

        return ans;
    }
}