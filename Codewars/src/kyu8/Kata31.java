package kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static java.util.stream.IntStream.of;

// https://www.codewars.com/MaxMinInList/577a98a6ae28071780000989/train/java

public class Kata31 {
    private MaxMinInList MaxMinInList = new MaxMinInList();

    @Test
    public void testExamples() {
        assertEquals(-110, MaxMinInList.min(new int[]{-52, 56, 30, 29, -54, 0, -110}));
        assertEquals(0, MaxMinInList.min(new int[]{42, 54, 65, 87, 0}));
        assertEquals(566, MaxMinInList.max(new int[]{4,6,2,1,9,63,-134,566}));
        assertEquals(5, MaxMinInList.max(new int[]{5}));
    }
}

class MaxMinInList {
    public int min(int[] list) {
        return of(list).min().orElse(0);
        // return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        return of(list).max().orElse(0);
        //return Arrays.stream(list).max().getAsInt();
    }
}