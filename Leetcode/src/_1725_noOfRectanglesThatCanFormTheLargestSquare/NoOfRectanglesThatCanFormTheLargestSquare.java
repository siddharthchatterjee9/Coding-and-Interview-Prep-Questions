package _1725_noOfRectanglesThatCanFormTheLargestSquare;

// https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/

public class NoOfRectanglesThatCanFormTheLargestSquare {
    public int countGoodRectangles(int[][] rectangles) {
        int count = 1;
        int[] array = new int[rectangles.length];
        for (int i = 0; i < rectangles.length; i++) {
            for (int j = 0; j < 2; j++) {
                if (rectangles[i][0] < rectangles[i][1]) {
                    array[i] = rectangles[i][0];
                }
                else {
                    array[i] = rectangles[i][1];
                }
            }
        }
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] == largest) {
                count++;
            }
            else if (array[i] > largest) {
                largest = array[i];
                count = 1;
            }
        }
        return count;
    }
}
