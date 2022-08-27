import backtracking.SudokuSolver;

import java.util.Arrays;

/**
 * Runs the algorithm examples.
 */
public class Main {
    public static void main(String[] args) {
        int[][] board0 = {
            {-1, 1, 2, -1, -1, 6, 5, 8, 9},
            {6, 7, -1, -1, -1, -1, -1, -1, 2},
            {-1, 8, 4, 1, -1, 5, 6, 3, -1},
            {4, 3, 8, 2, 5, 9, 1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, 7, 8, 1, 4, 3, 9, 5},
            {-1, 9, 6, 5, -1, 1, 7, 2, -1},
            {7, -1, -1, -1, -1, -1, -1, 5, 1},
            {5, 4, 1, 7, -1, -1, 8, 6, -1}
        };
        int[][] board1 = {
            {5, 3, -1, -1, 7, -1, -1, -1, -1},
            {6, -1, -1, 1, 9, 5, -1, -1, -1},
            {-1, 9, 8, -1, -1, -1, -1, 6, -1},
            {8, -1, -1, -1, 6, -1, -1, -1, 3},
            {4, -1, -1, 8, -1, 3, -1, -1, 1},
            {7, -1, -1, -1, 2, -1, -1, -1, 6},
            {-1, 6, -1, -1, -1, -1, 2, 8, -1},
            {-1, -1, -1, 4, 1, 9, -1, -1, 5},
            {-1, -1, -1, -1, 8, -1, -1, 7, 9}
        };

        SudokuSolver.solveSudoku(board0);

        for (int[] r : board0) { System.out.println(Arrays.toString(r)); }
    }
}