class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, provinces = 0;
        boolean visited[] = new boolean[n];
        Stack<Integer> cities = new Stack<>();

        for(int i=0; i<n; i++){
            if(visited[i]) continue;
            cities.push(i);
            while(!cities.isEmpty()){
                int city = cities.pop();
                visited[city] = true;
                for(int j=0; j<n; j++){
                    if(isConnected[city][j] == 1){
                        if(!visited[j]){
                            cities.push(j);
                        }
                    }
                }
            }
            provinces++;
        }
        return provinces;
    }
}