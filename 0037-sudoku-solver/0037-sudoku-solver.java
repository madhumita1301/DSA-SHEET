class Solution {
    static int check = 0;

    public boolean isValid(char[][] board, int row, int col, char num) {
        // checking the row
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == num)
                return false;
        }
        // checking the column
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == num)
                return false;
        }
        // checking the 3 x 3 grid
        int startRow = row / 3 * 3;
        int startCol = col / 3 * 3; // to get the col. no of the starting block of each 3x3 matrix
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    }
public void solve(char[][] board, int row, int col) {
    if (check == 1) return;  // stop if already solved

    // Base case: reached end of board
    if (row == 9) {
        check = 1;
        return;
    }

    // Move to next row if column passes 8
    if (col == 9) {
        solve(board, row + 1, 0);
        return;
    }

    // If current cell already filled, skip to next
    if (board[row][col] != '.') {
        solve(board, row, col + 1);
        return;
    }

    // Try placing numbers 1–9
    for (char ch = '1'; ch <= '9'; ch++) {
        if (isValid(board, row, col, ch)) {
            board[row][col] = ch;
            solve(board, row, col + 1);
            if (check == 1) return;  // stop if solved
            board[row][col] = '.';   // backtrack
        }
    }
}

    public void solveSudoku(char[][] board) {
        solve(board, 0, 0);
        check = 0;
    }
}