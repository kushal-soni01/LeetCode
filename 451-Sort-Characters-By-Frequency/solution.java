class Solution {
    public String frequencySort(String s) {
        int freqMap[][] = new int[128][2];
        for(char c: s.toCharArray()){
            freqMap[c][0] = c;
            freqMap[c][1]++;
        }
        Arrays.sort(freqMap, (a, b) -> Integer.compare(b[1], a[1]));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<128; i++){
            if(freqMap[i][1] == 0) break;
            sb.append(String.valueOf((char)freqMap[i][0]).repeat(freqMap[i][1]));
        }
        return sb.toString();
    }
}