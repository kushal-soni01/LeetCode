class Solution {
    public int gcd(int a, int b){
        return b==0 ? a : gcd(b, a%b);
    }
    public int findGCD(int[] nums) {
        int max = 0, min = 1001;
        for(int num: nums){
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return gcd(max, min);
    }
}