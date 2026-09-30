class Solution {
    public String getHint(String secret, String guess) {
        char secretChar[] = secret.toCharArray(), guessChar[] = guess.toCharArray();
        int n = secret.length(), secretFreq[] = new int[10], guessFreq[] = new int[10];
        int x = 0, y = 0;
        for(int i=0; i<n; i++){
            if(secretChar[i] == guessChar[i]){
                x++;
            }
            else{
                secretFreq[secretChar[i]-'0']++;
                guessFreq[guessChar[i]-'0']++;
            }
        }
        for(int i=0; i<10; i++){
            y+=Math.min(secretFreq[i], guessFreq[i]);
        }
        return x + "A" + y + "B";
    }
}