class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> {
            return a[1] != b[1] ? Integer.compare(b[1], a[1]) : Integer.compare(a[0], b[0]);
        });//char, freq.
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c: map.keySet()){
            heap.offer(new int[]{c, map.get(c)});
        }
        StringBuilder sb = new StringBuilder();
        while(!heap.isEmpty()){
            int[] charData = heap.poll();
            sb.append(String.valueOf((char)charData[0]).repeat(charData[1]));
        }
        return sb.toString();
    }
}