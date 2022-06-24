package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

// https://www.codewars.com/kata/57b58827d2a31c57720012e8/train/java

public class Kata26 {
    @Test
    public void exampleTests(){
        assertEquals(5.65d, Fuel.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, Fuel.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, Fuel.fuelPrice(5, 5.6d),  0.001d);
    }
}

class Fuel {
    public static double fuelPrice(int litres, double pricePerLitre) {
        double totalCost = litres * pricePerLitre;
        totalCost -= calcDiscount(litres);
        return totalCost;
    }
    private static double calcDiscount(int litres) {
           if (litres >= 10) {
               return 0.25 * litres;
           }
            if (litres >= 8) {
                return 0.20 * litres;
            }
            if (litres >= 6) {
                return 0.15 * litres;
            }
            if (litres >= 4) {
                return 0.10 * litres;
            }
            if (litres >= 2) {
                return 0.05 * litres;
            }
            return 0.0;
    }
}