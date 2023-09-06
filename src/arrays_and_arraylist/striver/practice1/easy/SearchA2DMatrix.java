package arrays_and_arraylist.striver.practice1.easy;

public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        boolean res1 = searchMatrix(matrix1, 61);
        System.out.println(res1);
    }
    static public boolean searchMatrix(int[][] matrix, int target) {
        if (searchRow(matrix, target, 0, matrix.length - 1) == -1) {
            return false;
        }
        else {
            return true;
        }
    }

    static int searchRow(int[][] matrix, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < matrix[mid][0]) {
                end = mid - 1;
            }
            else if (target > matrix[mid][matrix[mid].length - 1]) {
                start = mid + 1;
            }
            else {
                return searchCol(matrix, target, mid);
            }
        }
        return -1;
    }

    static int searchCol(int[][] matrix, int target, int row) {
        int start = 0, end = matrix[row].length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (target < matrix[row][mid]) {
                end = mid - 1;
            }
            else if (target > matrix[row][mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
