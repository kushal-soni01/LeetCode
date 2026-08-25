class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean numbers[] = new boolean[101];
        for(int num: nums){
            numbers[num] = true;
        }
        int ans = -1, max = 0;
        for(int i = k; i<101; i+=k){
            if(!numbers[i]) return i;
            max = i;
        }
        return max+k;
    }
}