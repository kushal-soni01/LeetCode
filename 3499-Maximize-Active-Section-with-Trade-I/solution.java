class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        String t = '1'+s+'1';
        int active = -2, size = 0, n = t.length();
        int blocks[] = new int[n];
        for(int i=0; i<n; i++){
            int j = i+1;
            while(j<n && t.charAt(i) == t.charAt(j)) j++;
            if(t.charAt(i) == '1') active+=j-i;
            blocks[size++] = j-i;
            i=j-1;
        }
        int gain = 0;
        for(int i=2; i<size-2; i+=2){
            gain = Math.max(gain, blocks[i-1]+blocks[i+1]);
        }
        return active+gain;
    }
}