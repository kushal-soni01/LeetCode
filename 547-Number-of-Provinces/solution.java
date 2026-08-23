class Solution {
    private void dfs(int[][] isConnected, boolean[] visited, int city, int n){
        if(visited[city]) return;
        visited[city] = true;
        for(int i=0; i<n; i++){
            if(isConnected[city][i] == 1) dfs(isConnected, visited, i, n);
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, provinces = 0;
        boolean visited[] = new boolean[n];

        for(int i=0; i<n; i++){
            if(visited[i]) continue;
            dfs(isConnected, visited, i, n);
            provinces++;
        }
        
        return provinces;
    }
}