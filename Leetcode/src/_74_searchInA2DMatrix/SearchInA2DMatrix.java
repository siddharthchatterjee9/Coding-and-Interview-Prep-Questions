package _74_searchInA2DMatrix;

public class SearchInA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int right = rows * columns;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int i = mid / columns;
            int j = mid % columns;
            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target) {
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return false;
    }
}
