class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length, sum = 0, prefixSum[] = new int[n+1];
        for(int i=0; i<n; i++){
            prefixSum[i+1] = prefixSum[i] + arr[i];
        }
        for(int i=0; i<n; i++){
            for(int j = i+1; j<=n; j+=2){
                sum += prefixSum[j] - prefixSum[i];
            }
        }
        return sum;
    }
}