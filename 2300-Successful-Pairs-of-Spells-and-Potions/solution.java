class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length, ans[] = new int[n], m = potions.length;
        Arrays.sort(potions);
        for(int i=0; i<n; i++){
            int target = (int)Math.ceil((double)success/spells[i]);
            int low = 0, high = m-1, res = m;
            while(low <= high){
                int mid = low + (high - low)/2;
                if(potions[mid] >= target){
                    res = mid;
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            ans[i] = m - res;
        }
        return ans;
    }
}