package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;
// https://www.codewars.com/kata/62a611067274990047f431a8/train/java

class Kata1 {
        @Test
        void smallArray() {
            assertEquals(new String[]{"true", "false", "true", "false", "true"},
                    5, "true", "false");
        }

        @Test
        void largerArray() {
            assertEquals(new String[]{"blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red", "blue", "red"},
                    20, "blue", "red");
        }

        @Test
        void withZero() {
            assertEquals(new String[0], 0, "lemons", "apples");
        }

        private void assertEquals(String[] expected, int n, String firstValue, String secondValue) {
            String[] actual = nAndTwoValues.alternate(n, firstValue, secondValue);
            assertArrayEquals(expected, actual, String.format("For input (%d, \"%s\", \"%s\")%nExpected: %s%nActual: %s%n", n, firstValue, secondValue, Arrays.toString(expected), Arrays.toString(actual)));
        }
}


class nAndTwoValues {
    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] array = new String[n];
        for (int i = 0; i < n; i += 2) {
            array[i] = firstValue;
            if (i + 1 < n) {
                array[i+1] = secondValue;
            }
        }
        return array;
    }
}