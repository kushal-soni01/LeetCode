class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        HashMap<List<Integer>, Integer> rowMap = new HashMap<>();
        for(int row[]: grid){
            List<Integer> list = new ArrayList<>();
            for(int ele: row){
                list.add(ele);
            }
            rowMap.put(list, rowMap.getOrDefault(list, 0)+1);
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            for(int j=0; j<n; j++){
                list.add(grid[j][i]);
            }
            if(rowMap.containsKey(list)){
                ans += rowMap.get(list);
            }
        }
        return ans;
    }
}