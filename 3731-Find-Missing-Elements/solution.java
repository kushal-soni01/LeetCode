class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int mx = 0, n = nums.length, min = Integer.MAX_VALUE;
        List<Integer> ls = new ArrayList<>();
        for(int num: nums){
            mx = Math.max(mx, num);
            min = Math.min(min, num);
        }
        int count[] = new int[mx+1];
        for(int num: nums){
            count[num]++;
        }
        for(int i=min; i<mx+1; i++){
            if(count[i] == 0) ls.add(i);
        }
        return ls;
    }
}