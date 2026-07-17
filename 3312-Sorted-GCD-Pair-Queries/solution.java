class Solution {
    public int getNextGreater(long[] gcdPairsCount, int low, int high, long ele){
        int idx = high-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(gcdPairsCount[mid] <= ele){
                low = mid+1;
            }
            else{
                idx = mid;
                high = mid-1;
            }
        }
        return idx;
    }

    public int[] gcdValues(int[] nums, long[] queries) {
        int maxEle = 0, n = nums.length;
        for(int i=0; i<n; i++) maxEle = Math.max(nums[i], maxEle);

        int countFreq[] = new int[maxEle+1];
        for(int num: nums) countFreq[num]++;

        long gcdPairsCount[] = new long[maxEle+1];
        for(int i=maxEle; i>0; i--){
            long pairCount = 0;
            for(int j=i; j <= maxEle; j+=i){
                pairCount += countFreq[j];
            }

            gcdPairsCount[i] = (pairCount*(pairCount-1))/2;
            
            for(int j=2*i; j<=maxEle; j+=i){
                gcdPairsCount[i] -= gcdPairsCount[j];
            }
        }

        for(int i=1; i<=maxEle; i++){
            gcdPairsCount[i] += gcdPairsCount[i-1];
        }
      
        int[] ans = new int[queries.length];
        for(int i=0; i<queries.length; i++){
            ans[i] = getNextGreater(gcdPairsCount, 0, maxEle, queries[i]);
        }
        return ans;
    }
}