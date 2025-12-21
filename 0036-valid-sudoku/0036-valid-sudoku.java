class Solution {

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

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') // no checking of vacant blocks is needed
                    continue;
                char num = board[i][j];
                board[i][j] = '.'; //making it empty for a while
                if (isValid(board, i, j, num) == false)
                    return false;
                board[i][j] = num;
            }
        }
        return true;
    }
}