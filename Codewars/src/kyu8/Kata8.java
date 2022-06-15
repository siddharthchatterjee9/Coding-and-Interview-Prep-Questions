package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class Kata8 {
    public class ExampleTest {
        @Test
        public void one() {
            assertArrayEquals(new int[]{1,15,15}, CatDogHuman.humanYearsCatYearsDogYears(1));
        }
        @Test
        public void two() {
            assertArrayEquals(new int[]{2,24,24}, CatDogHuman.humanYearsCatYearsDogYears(2));
        }
        @Test
        public void ten() {
            assertArrayEquals(new int[]{10,56,64}, CatDogHuman.humanYearsCatYearsDogYears(10));
        }
    }
}

class CatDogHuman {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0, dogYears = 0;
        switch (humanYears) {
            default:
                catYears = 4 * (humanYears - 2);
                dogYears = 5 * (humanYears - 2);
            case 2:
                catYears += 9;
                dogYears += 9;
            case 1:
                catYears += 15;
                dogYears += 15;
        }
        return new int[]{humanYears, catYears, dogYears};
    }
}