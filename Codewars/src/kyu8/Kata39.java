package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

// https://www.codewars.com/kata/563b74ddd19a3ad462000054/train/java
// S. Chatterjee
public class Kata39 {
    @Test
    public void startTest() {
        assertEquals("Your string should start with a 1", '1', Stringy.stringy(3).charAt(0));
    }

    @Test
    public void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, Stringy.stringy(size).length());
        }
    }
}

class Stringy {
    public static String stringy(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i % 2 == 0) {
                builder.append(1);
            }
            else {
                builder.append(0);
            }
        }
        return builder.toString();
    }
}