package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata11 {
    @Test
    public void exampleTests() {
        assertEquals(0, Num.nthEven(1));
        assertEquals(2, Num.nthEven(2));
        assertEquals(4, Num.nthEven(3));
        assertEquals(198, Num.nthEven(100));
        assertEquals(2597466, Num.nthEven(1298734));
    }
}
class Num {
    public static int nthEven(int n) {
        return --n + n;
    }
}