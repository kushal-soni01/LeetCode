class Solution {
    public boolean isValid(int n, int rowIdx, int colIdx, String[][] board){
        for(int i=0; i<rowIdx; i++){
            if(board[i][colIdx].equals("Q")) return false;
        }
        for(int i=rowIdx-1, j=colIdx-1; i>=0 && j>=0; i--, j--){
            if(board[i][j].equals("Q")) return false;
        }
        for(int i=rowIdx-1, j=colIdx+1; i>=0 && j<n; i--, j++){
            if(board[i][j].equals("Q")) return false;
        }
        return true;
    }

    public void solve(int n, int row, String[][] board, List<List<String>> ans){
        if(row==n){
            List<String> solution = new ArrayList<>();
            for(String[] boardRow: board){
                solution.add(String.join("", boardRow));
            }
            ans.add(solution);
            return;
        }
        for(int j=0; j<n; j++){
            if(isValid(n, row, j, board)){
                board[row][j] = "Q";
                solve(n, row+1, board, ans);
                board[row][j] = ".";
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        String[][] board = new String[n][n];
        for(String[] row: board){
            Arrays.fill(row, ".");
        }
        List<List<String>> ans = new ArrayList<>();
        solve(n, 0, board, ans);
        return ans;
    }
}