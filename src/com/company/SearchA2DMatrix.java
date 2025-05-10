package com.company;

public class SearchA2DMatrix {
    public static void main(String[] args) {

        // Test cases
        int[][] matrix1 = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };

        System.out.println(searchMatrix(matrix1, 3)); // Expected: true
        System.out.println(searchMatrix(matrix1, 13)); // Expected: false

        int[][] matrix2 = {
                { 1 }
        };
        System.out.println(searchMatrix(matrix2, 1)); // Expected: true
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = helperFindRow(matrix, 0, matrix.length - 1, target);

        if (targetRow == -1)
            return false;

        else
            return helperFindIndexofTarget(matrix[targetRow], 0, matrix[targetRow].length - 1, target) == -1
                    ? false
                    : true;
    }

    private static int helperFindRow(int[][] matrix, int low, int high, int target) {
        int middle = (low + high) / 2;

        if (low > high)
            return -1;

        else if (matrix[middle][0] <= target && target <= matrix[middle][matrix[middle].length - 1])
            return middle;

        else if (target < matrix[middle][0])
            return helperFindRow(matrix, low, middle - 1, target);

        else
            return helperFindRow(matrix, middle + 1, high, target);
    }

    private static int helperFindIndexofTarget(int[] row, int low, int high, int target) {
        int middle = (low + high) / 2;

        if (low > high)
            return -1;

        else if (row[middle] == target)
            return middle;

        else if (target < row[middle])
            return helperFindIndexofTarget(row, low, middle - 1, target);

        else
            return helperFindIndexofTarget(row, middle + 1, high, target);
    }
}