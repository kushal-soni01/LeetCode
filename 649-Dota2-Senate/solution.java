class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        ArrayDeque<Integer> radiant = new ArrayDeque<>(), dire = new ArrayDeque<>();
        for(int i = 0; i<n; i++){
            if(senate.charAt(i) == 'R') radiant.offer(i);
            else dire.offer(i);
        }
        while(!radiant.isEmpty() && !dire.isEmpty()){
            if(radiant.peek() < dire.peek()){
                dire.poll();
                radiant.offer(radiant.poll()+n);
            }
            else{
                radiant.poll();
                dire.offer(dire.poll()+n);
            }
        }
        if(!radiant.isEmpty()) return "Radiant";
        return "Dire";
    }
}