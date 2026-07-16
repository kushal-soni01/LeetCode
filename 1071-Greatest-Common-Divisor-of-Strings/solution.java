class Solution {
    public int gcd(int high, int low){
        return low == 0 ? high : gcd(low, high%low);
    }
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            return str1.substring(0, gcd(str1.length(), str2.length()));
        }
        return "";
    }
}