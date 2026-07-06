class Solution {
    public int nthUglyNumber(int n) {
        int ugly[] = new int[1692];
        ugly[1] = 1;
        int p2 = 1, p3 = 1, p5 = 1, i=1;
        while(i++<n){
            int min = Math.min(ugly[p2]*2, Math.min(ugly[p3]*3, ugly[p5]*5));
            if(ugly[p2]*2 == min) p2++;
            if(ugly[p3]*3 == min) p3++;
            if(ugly[p5]*5 == min) p5++;
            ugly[i] = min;
        }
        return ugly[n];
    }
}