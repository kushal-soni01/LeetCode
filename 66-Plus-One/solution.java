class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i=digits.length-1; i>=0; i--){
            int sum = digits[i]+carry;
            if(sum/10==0){
                digits[i] = sum;
                return digits;
            }
            digits[i]=sum%10;
        }
        int[] num = new int[digits.length+1];
        num[0] = 1;
        for(int i=1; i<num.length; i++){
            num[i] = digits[i-1];
        }
        return num;
    }
}