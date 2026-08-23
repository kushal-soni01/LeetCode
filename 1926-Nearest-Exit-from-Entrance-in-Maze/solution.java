class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int rows = maze.length, cols = maze[0].length;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        int directions[][] = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while(!queue.isEmpty()){
            int curr[] = queue.poll();
            int row = curr[0], col = curr[1], steps = curr[2];

            for(int[] dir: directions){
                int nr = row+dir[0],  nc = col+dir[1];
                if(nr >= 0 && nr<rows && nc >=0 && nc < cols && maze[nr][nc]=='.'){
                    if(nr == 0 || nr == rows-1 || nc == 0 || nc == cols-1){
                        return steps+1;
                    }
                    maze[nr][nc] = '+';
                    queue.offer(new int[] {nr, nc, steps+1});
                }
            }
        }
        return -1;
    }
}