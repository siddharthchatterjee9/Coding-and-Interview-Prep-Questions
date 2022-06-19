package kyu8;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

// https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java

public class Kata17 {
    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{-6, 32, 25}, MultipleOfIndex.mulOfInd(new int[]{22, -6, 32, 82, 9, 25}));
        assertArrayEquals(new int[]{-1, 10}, MultipleOfIndex.mulOfInd(new int[]{68, -1, 1, -7, 10, 10}));
        assertArrayEquals(new int[]{-11}, MultipleOfIndex.mulOfInd(new int[]{11, -11}));
        assertArrayEquals(new int[]{-85, 72, 0, 68}, MultipleOfIndex.mulOfInd(new int[]{-56,-85,72,-26,-14,76,-27,72,35,-21,-67,87,0,21,59,27,-92,68}));
        assertArrayEquals(new int[]{38, -44, -99}, MultipleOfIndex.mulOfInd(new int[]{28,38,-44,-99,-13,-54,77,-51}));
        assertArrayEquals(new int[]{-49, 8, -60, 35}, MultipleOfIndex.mulOfInd(new int[]{-1,-49,-1,67,8,-60,39,35}));
    }
}
class MultipleOfIndex {
    public static int[] mulOfInd(int[] array) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < array.length; i++) {
            if (array[i] % i == 0) {
                list.add(array[i]);
            }
        }
        int[] newArray = new int[list.size()];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = list.get(j);
        }
        return newArray;
    }
}