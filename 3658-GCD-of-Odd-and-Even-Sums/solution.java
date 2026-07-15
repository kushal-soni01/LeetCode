class Solution {
    public int gcd(int sumEven, int sumOdd){
        if(sumOdd == 0){
            return sumEven;
        }
        return gcd(sumOdd, sumEven%sumOdd);
    }
    public int gcdOfOddEvenSums(int n) {
        return gcd(n*(n+1), n*n);
    }
}