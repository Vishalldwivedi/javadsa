import java.util.HashSet;

class Solution {

    public static boolean isValidSudoku(int[][] board) {
        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i) || !isValidColumn(board, i)) {
                return false;
            }
        }

        // Check 3 x 3 sub-boxes
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubBox(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isValidRow(int[][] board, int row) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            int current = board[row][i];
            if (current != '.' && !set.add(current)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidColumn(int[][] board, int col) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            int current = board[i][col];
            if (current != 0 && !set.add(current)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidSubBox(int[][] board, int startRow, int startCol) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                int current = board[i][j];
                if (current != 0 && !set.add(current)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[][] board = { { 7, 9, 2, 1, 5, 4, 3, 8, 6 },
                { 6, 4, 3, 8, 2, 7, 1, 5, 9 },
                { 8, 5, 1, 3, 9, 6, 7, 2, 4 },
                { 2, 6, 5, 9, 7, 3, 8, 4, 1 },
                { 4, 8, 9, 5, 6, 1, 2, 7, 3 },
                { 3, 1, 7, 4, 8, 2, 9, 6, 5 },
                { 1, 3, 6, 7, 4, 8, 5, 9, 2 },
                { 9, 7, 4, 2, 1, 5, 6, 3, 8 },
                { 5, 2, 8, 6, 3, 9, 4, 1, 7 } };


        if (isValidSudoku(board)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}