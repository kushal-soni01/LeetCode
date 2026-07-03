class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> Integer.compare(b[0], a[0]));
        for(int i=0; i<n; i++){
            maxHeap.offer(new int[] {score[i], i});
        }
        String answer[] = new String[n];
        int position = 1;
        for(int i=0; i<n; i++){
            int[] placement = maxHeap.poll();
            if(position == 1){
                answer[placement[1]] = "Gold Medal";
                position++;
            }
            else if(position == 2){
                answer[placement[1]] = "Silver Medal";
                position++;
            }
            else if(position == 3){
                answer[placement[1]] = "Bronze Medal";
                position++;
            }
            else{
                answer[placement[1]] = String.valueOf(position);
                position++;
            }
        }
        return answer;
    }
}