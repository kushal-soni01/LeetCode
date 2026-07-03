class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n=mat[0].length;
        int[] strengths = new int[m];
        for(int i=0; i<m; i++){
            int count = 0;
            for(int j=0; j<n; j++){
                if(mat[i][j] == 1) count++;
            }
            strengths[i] = count;
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> {
            return Integer.compare(a[0], b[0]) != 0 ? Integer.compare(b[0], a[0]) : Integer.compare(b[1], a[1]);
            });

        for(int i=0; i<m; i++){
            heap.offer(new int[] {strengths[i], i});
            if(heap.size()>k) heap.poll();
        }

        int ans[] = new int[k];
        for(int i=k-1; i>=0; i--){
            ans[i] = heap.poll()[1];
        }
        return ans;
    }
}