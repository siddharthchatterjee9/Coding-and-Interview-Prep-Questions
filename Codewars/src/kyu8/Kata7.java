package kyu8;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;

public class Kata7 {
    @Test
    public void fixedTest() {
        assertTrue(beastDish.feast("great blue heron","garlic nann"));
        assertTrue(beastDish.feast("chickadee","chocolate cake"));
        assertFalse(beastDish.feast("brown bear","bear claw"));
    }
}

class beastDish {
    public static boolean feast(String beast, String dish) {
        if (beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1))
            return true;
        else
            return false;
    }
}