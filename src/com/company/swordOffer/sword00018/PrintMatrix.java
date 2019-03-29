package com.company.swordOffer.sword00018;

/**
 * 顺时针打印矩阵
 */
public class PrintMatrix {

    public void printMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (left <= right && up <= down) {
            for (int i = left; i <= right; i++) {
                System.out.println(matrix[up][i]);
            }
            up++;
            for (int i = up; i <= down; i++) {
                System.out.println(matrix[i][right]);
            }
            right--;
            if (up - 1 != down) {
                for (int i = right; i >= left; i--) {
                    System.out.println(matrix[down][i]);
                }
            }
            down--;
            if (right + 1 != left) {
                for (int i = down; i >= up; i--) {
                    System.out.println(matrix[i][left]);
                }
            }
            left++;
        }
    }

    public static void main(String[] args) {
        PrintMatrix printMatrix = new PrintMatrix();
        printMatrix.printMatrix(new int[][]{{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}});
    }
}
