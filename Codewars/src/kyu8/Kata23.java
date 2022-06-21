package kyu8;

import java.lang.Math;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

// https://www.codewars.com/kata/57f6ad55cca6e045d2000627/train/java

public class Kata23 {
    @Test
    public void basicTests() {
        int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
        int[] expected = new int[] { 2, 9, 3, 49, 4, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(input)));

        input = new int[] { 100, 101, 5, 5, 1, 1 };
        expected = new int[] { 10, 10201, 25, 25, 1, 1 };
        assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(input)));

        input = new int[] { 1, 2, 3, 4, 5, 6 };
        expected = new int[] { 1, 4, 9, 2, 25, 36 };
        assertEquals(Arrays.toString(expected), Arrays.toString(ToSquareOrNotToSquare.squareOrSquareRoot(input)));
    }
}

class ToSquareOrNotToSquare {
    public static int[] squareOrSquareRoot(int[] array) {
        /*ArrayList<Integer> list = new ArrayList<Integer>(array.length);
        for (int i : array) {
            if (Math.sqrt(i) % 1 == 0) {
                list.add( (int) Math.sqrt(i));
            }
            else {
                list.add(i * i);
            }
        }
        int[] newArray = new int[list.size()];
        for (int j = 0; j < newArray.length; j++) {
            newArray[j] = list.get(j);
        }
        return newArray;*/
        for(int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            }
            else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }
}