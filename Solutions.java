class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        // Check every cell as starting point
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {

        // Word found completely
        if (index == word.length()) {
            return true;
        }

        // Boundary check + character mismatch
        if (i < 0 || j < 0 || i >= board.length || 
            j >= board[0].length || 
            board[i][j] != word.charAt(index)) {
            return false;
        }

        // Mark cell as visited
        char temp = board[i][j];
        board[i][j] = '#';

        // Explore 4 directions
        boolean found = dfs(board, word, i + 1, j, index + 1) ||
                        dfs(board, word, i - 1, j, index + 1) ||
                        dfs(board, word, i, j + 1, index + 1) ||
                        dfs(board, word, i, j - 1, index + 1);

        // Restore original value
        board[i][j] = temp;

        return found;
    }
}
