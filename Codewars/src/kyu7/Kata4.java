package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata4 {
    @Test
    void basicTest(){
        assertEquals(null, Kata.prevMultOfThree(1), "For input 1");
        assertEquals(null, Kata.prevMultOfThree(25), "For input 25");
        assertEquals(36, Kata.prevMultOfThree(36), "For input 36");
        assertEquals(12, Kata.prevMultOfThree(1244), "For input 1244");
        assertEquals(9, Kata.prevMultOfThree(952406), "For input 952406");
    }
}

class Kata {
    public static Integer prevMultOfThree(int n){
        //return n % 3 == 0 ? n : n > 10 ? prevMultOfThree(n / 10) : null;
        for (; n > 0; n /= 10) {
            if (n % 3 == 0) {
                return n;
            }
        }
        return null;
    }
}