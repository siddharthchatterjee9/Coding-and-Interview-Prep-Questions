package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Kata1 {
    @Test
    public void test1() {
        assertArrayEquals( "Depth 1 should return [ [1] ]",
                new int[][] { {1} },
                PascalsTriangle.pascal(1));
    }

    @Test
    public void test5() {
        assertArrayEquals("Depth 5 should return [ [1], [1,1], [1,2,1], [1,3,3,1], [1,4,6,4,1] ]",
                new int[][] { {1}, {1,1}, {1,2,1}, {1,3,3,1}, {1,4,6,4,1} },
                PascalsTriangle.pascal(5));
    }
}

class PascalsTriangle {
    public static int[][] pascal(int depth) {
        int[][] triangle = new int[depth][];
        for (int i = 0; i < depth; i++) {
            triangle[i] = new int[i+1];
            triangle[i][0] = 1;
            triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i-1][j] + triangle[i-1][j-1];
            }
        }
        return triangle;
    }
}
