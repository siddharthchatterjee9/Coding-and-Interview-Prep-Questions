package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.runners.JUnit4;
// https://www.codewars.com/kata/5861d28f124b35723e00005e/train/java

public class Kata15 {
    @Test
    public void testSomething() {
        assertTrue(GallonFuelPump.zeroFuel(50, 25, 2));
        assertFalse(GallonFuelPump.zeroFuel(100, 50, 1));
    }
}

class GallonFuelPump {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (mpg * fuelLeft >= distanceToPump) {
            return true;
        }
        else {
            return false;
        }
    }

}
