class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        int n = arr.length, maxEle = 1;
        int countSort[] = new int[n+1];
        for(int i=0; i<n; i++){
            countSort[Math.min(n, arr[i])]++;
        }
        for(int i=2; i<n+1; i++){
            maxEle = Math.min(maxEle + countSort[i], i);
        }
        return maxEle;
    }
}