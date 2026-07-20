class Solution {
    public void addRowEle(List<List<Integer>> ans, List<Integer> list, int val, int n){
        list.add(val);
        if(list.size() == n){
            ans.add(new ArrayList<>(list));
            list.clear();
        }    
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        k = (m*n) - k%(m*n);
        List<List<Integer>> ans = new ArrayList<>(m);
        List<Integer> list = new ArrayList<>(n);

        for(int i=0; i<m*n; i++){
            int idx = (i+k)%(m*n);
            addRowEle(ans, list, grid[idx/n][idx%n], n);
        }

        // for(int i=0; i<k; i++){
        //     addRowEle(ans, list, grid[i/n][i%n], n);
        // }

        // for(int i=iStart; i<m; i++){
        //     for(int j = i==iStart ? jStart : 0; j<n; j++){
        //         list.add(grid[i][j]);
        //         if(list.size() == n){
        //             ans.add(new ArrayList<>(list));
        //             list.clear();
        //         }
        //     }
        // }
        // for(int i = 0; i<=iStart; i++){
        //     if(i == iStart){
        //         for(int j=0; j<jStart; j++){
        //             list.add(grid[i][j]);
        //             if(list.size() == n){
        //                 ans.add(new ArrayList<>(list));
        //                 list.clear();
        //             }
        //         }
        //         continue;
        //     }
        //     for(int j=0; j<n; j++){
        //         list.add(grid[i][j]);
        //         if(list.size() == n){
        //             ans.add(new ArrayList<>(list));
        //             list.clear();
        //         }
        //     }
        // }
        return ans;
    }
}