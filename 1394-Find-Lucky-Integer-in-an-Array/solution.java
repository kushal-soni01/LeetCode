class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int ans = -1;
        for(int i: map.keySet()){
            if(i==map.get(i)) ans = Math.max(i, ans);
        }
        return ans;
    }
}