        while(count>=0){
            int val = (int)Math.pow(2, count);
            int add = val * (n%2);
            ans += add;
            count--;
            n/=2;
        }
        return ans;
    }
}
    public int reverseBits(int n) {
        int ans = 0;
        int count  = 31;
class Solution {
