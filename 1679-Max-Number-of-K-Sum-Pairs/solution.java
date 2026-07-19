class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            if(num>k) continue;
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        int ans = 0;
        for(int key: map.keySet()){
            if(map.get(key) == 0) continue; 
            int val = Math.abs(key-k);
            if(map.containsKey(val)){
                if(key == val) ans+=map.get(key)/2;                
                else ans+=Math.min(map.get(key), map.get(val));
            }
            map.put(key, 0);
        }
        return ans;
    }
}
