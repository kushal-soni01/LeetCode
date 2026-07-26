class Solution {
    public int maximumProduct(int[] nums) {
        int mx = Integer.MIN_VALUE, smx = Integer.MIN_VALUE, tmx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE, smn = Integer.MAX_VALUE;

        for(int num: nums){
            if(num > mx){
                tmx = smx;
                smx = mx;
                mx = num;
            } 
            else if(num > smx){
                tmx = smx;
                smx = num;
            }
            else if(num > tmx) tmx = num;

            if(num < mn) {
                smn = mn;
                mn = num;
            }
            else if(num < smn) smn = num;
        }

        return Math.max(mx * smx * tmx, mx * mn * smn);
    }
}