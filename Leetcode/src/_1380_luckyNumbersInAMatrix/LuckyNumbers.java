package _1380_luckyNumbersInAMatrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++) {
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            // we calculate the minimum value in the row
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minIndex = j;
                }
            }
            boolean isTrue = true;
            // we check whether that value is maximum in its column
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][minIndex] < matrix[j][minIndex]) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) {
                list.add(matrix[i][minIndex]);
            }
        }
        return list;
    }
}
