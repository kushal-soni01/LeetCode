class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: arr){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        Set<Integer> occurance = new HashSet<>();
        for(int key: map.keySet()){
            int val = map.get(key);
            if(occurance.contains(val)) return false;
            occurance.add(val);
        }
        return true;
    }
}