class Solution {
    public boolean canFinish(int[] piles, int mid, int h){
        int hours=0;
        for(int i=0; i<piles.length; i++){
            hours+=Math.ceil(piles[i] * 1d/mid);
            if(hours>h) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i=0; i<piles.length; i++){
            max=Math.max(max, piles[i]);
        }
        int start = 1, end = max, ans=max;
        while(start<=end){
            int mid=start+(end-start)/2;
            if (canFinish(piles, mid, h)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}