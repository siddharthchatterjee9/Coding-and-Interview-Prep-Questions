package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Kata13 {
    @Test
    public void testToBinary() {
        assertEquals(1, BinaryNumber.toBinary(1));
        assertEquals(10, BinaryNumber.toBinary(2));
        assertEquals(11, BinaryNumber.toBinary(3));
        assertEquals(101, BinaryNumber.toBinary(5));
    }
}

class BinaryNumber {
    public static int toBinary(int n) {
        String bin = Integer.toBinaryString(n);
        return Integer.parseInt(bin);
    }

}