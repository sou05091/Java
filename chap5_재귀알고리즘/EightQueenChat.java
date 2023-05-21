package chap5_재귀알고리즘;

import java.util.ArrayList;
import java.util.List;

public class EightQueenChat {
    private static final int BOARD_SIZE = 8;
    private static final int QUEEN_COUNT = 8;

    public static void main(String[] args) {
        int[][] board = new int[BOARD_SIZE][BOARD_SIZE];
        List<Integer> queenPositions = new ArrayList<>();

        solveQueen(board, queenPositions, 0);

        if (queenPositions.size() == QUEEN_COUNT) {
            System.out.println("Solution found:");
            printBoard(board);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static void solveQueen(int[][] board, List<Integer> queenPositions, int row) {
        if (queenPositions.size() == QUEEN_COUNT) {
            // All queens have been placed successfully
            return;
        }

        if (row >= BOARD_SIZE) {
            // Reached the end of the board without placing all queens
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            if (isSafe(board, queenPositions, row, col)) {
                // Place the queen at the current position
                board[row][col] = 1;
                queenPositions.add(col);

                // Move on to the next row
                solveQueen(board, queenPositions, row + 1);

                // Backtrack: Remove the queen from the current position
                board[row][col] = 0;
                queenPositions.remove(queenPositions.size() - 1);
            }
        }
    }

    public static boolean isSafe(int[][] board, List<Integer> queenPositions, int row, int col) {
        // Check if the current position is safe for a queen

        // Check if the current column already has a queen
        if (queenPositions.contains(col)) {
            return false;
        }

        // Check for diagonal conflicts with previously placed queens
        for (int i = 0; i < queenPositions.size(); i++) {
            int queenRow = i;
            int queenCol = queenPositions.get(i);

            if (Math.abs(row - queenRow) == Math.abs(col - queenCol)) {
                return false;
            }
        }

        return true;
    }

    public static void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
