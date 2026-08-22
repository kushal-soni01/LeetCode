class Solution {
    public boolean checkDivisibility(int n) {
        long sum = 0, product = 1, num = n;
        while(num > 0){
            int rem = (int)num%10;
            sum += rem;
            product *= rem;
            num/=10;
        }
        return n % (sum + product) == 0;
    }
}