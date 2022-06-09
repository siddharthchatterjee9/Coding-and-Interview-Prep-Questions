package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata6 {
    @Test
    public void testSomething() {
        assertEquals("", CanCountSheep.countingSheep(0));
        assertEquals("1 sheep...", CanCountSheep.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", CanCountSheep.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", CanCountSheep.countingSheep(3));
    }
}

class CanCountSheep {
    public static String countingSheep(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            sb.append(i).append(" sheep...");
        }
        return sb.toString();
    }
}