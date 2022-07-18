package kyu8;

import org.junit.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

// https://www.codewars.com/kata/56598d8076ee7a0759000087/train/java

public class Kata53 {
    @Test
    public void test1() {
        assertEquals(new Integer(2), TipCalculator.calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        assertEquals(new Integer(4), TipCalculator.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test3() {
        assertNull(TipCalculator.calculateTip(20d, "hi"));
    }

    @Test
    public void test4() {
        assertEquals(new Integer(17), TipCalculator.calculateTip(107.65, "GReat"));
    }
}

class TipCalculator {
    public static Integer calculateTip(double amount, String rating) {
        Map<String, Double> map = new HashMap<>();
        map.put("terrible", 0.0);
        map.put("poor", 0.05);
        map.put("good", 0.1);
        map.put("great", 0.15);
        map.put("excellent", 0.2);
        return map.containsKey(rating.toLowerCase()) ? (int) (Math.ceil(amount * map.get(rating.toLowerCase()))) : null;
    }
}