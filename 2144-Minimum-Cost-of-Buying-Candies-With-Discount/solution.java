class Solution {
    public int minimumCost(int[] cost) {
        int totalCost = 0;
        Arrays.sort(cost);
        int bought = 0;
        for(int i=cost.length-1; i>=0; i--){
            if(bought==2){
                bought=0;
                continue;
            }
            totalCost+=cost[i];
            bought++;
        }
        return totalCost;
    }
}