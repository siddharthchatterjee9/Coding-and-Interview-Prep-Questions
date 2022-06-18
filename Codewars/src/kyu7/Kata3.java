package kyu7;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/* https://www.codewars.com/kata/604517d65b464d000d51381f/java */

public class Kata3 {
    @Test
    public void sampleTestCases(){
        assertEquals("For n=11 and k=2: ", 4, StrangeMaths.mathematics(11, 2));
        assertEquals("For n=15 and k=5: ", 11, StrangeMaths.mathematics(15, 5));
        assertEquals("For n=15 and k=15: ", 7, StrangeMaths.mathematics(15, 15));
        }
}
class StrangeMaths {
    public static int mathematics(int n, int k) {
        int pos = 0;
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = String.valueOf(i+1);
        }
        Arrays.sort(numbers);
        for (int j = 0; j < n; j++) {
            if (numbers[j].equals(String.valueOf(k))) {
                pos = j + 1;
                break;
            }
        }
        return pos;
    }
}
