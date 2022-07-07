package kyu8;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class Kata45 {
    @Test
    public void test() {
        System.out.println("Fixed Tests");
        assertEquals("[8.6667, 6.6667]", Arrays.toString(Barycenter.barTriang(
                new double[]{4,6}, new double[]{12,4}, new double[]{10,10})));
        assertEquals("[7.3333, 4.6667]", Arrays.toString(Barycenter.barTriang(
                new double[]{4,2}, new double[]{12,2}, new double[]{6,10})));

    }
}

class Barycenter {
    public static double[] barTriang(double[] x, double[] y, double[] z) {
        double[] array = new double[2];
        array[0] = (double) Math.round ( ( x[0] + y[0] + z[0] ) / 3 * 10000d) / 10000d;
        array[1] = (double) Math.round ( ( x[1] + y[1] + z[1] ) / 3 * 10000d) / 10000d;
        return array;
    }
}