import javafx.util.Pair;

import java.util.Random;

/*
You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall. Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start.
If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]

and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps required to reach the end is 7, since we would need to go through (1, 2)
because there is a wall everywhere else on the second row.
 */
public class DCP23 {

    public static void main(String[] args) {

        DCP23 dcp23 = new DCP23();
        boolean [][] matrix = dcp23.createMatrix(2,2);
        dcp23.printMatrix(matrix);
        Pair start = new Pair(3,0);
        Pair end = new Pair(0,0);
        System.out.println(dcp23.minSteps(matrix, start, end));

    }

    public int minSteps(boolean[][] matrix, Pair start, Pair end){
        return 0;
    }

    public boolean[][] createMatrix(int m, int n){
        boolean[][] matrix = new boolean[m + 1][n + 1];
        Random random = new Random();
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){

                matrix[i][j] = random.nextBoolean();

            }
        }
        return matrix;
    }

    public void printMatrix(boolean[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
