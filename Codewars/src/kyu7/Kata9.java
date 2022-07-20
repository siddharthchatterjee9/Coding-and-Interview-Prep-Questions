package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.*;

// https://www.codewars.com/kata/6071ef9cbe6ec400228d9531/train/java

public class Kata9 {
    @Test
    public void exampleTest() {
        assertEquals(".....", DotCalculator.calc("..... // ."));
        assertEquals("..........", DotCalculator.calc("..... * .."));
        assertEquals("..", DotCalculator.calc("..... // .."));
        assertEquals("....", DotCalculator.calc("..... - ."));
        assertEquals("....................", DotCalculator.calc("..... + ..............."));
        assertEquals("...............", DotCalculator.calc("..... * ..."));
        assertEquals("..", DotCalculator.calc("..... - ..."));
        assertEquals("", DotCalculator.calc(". - ."));
        assertEquals("", DotCalculator.calc(". // .."));
    }
}

class DotCalculator {
    public static String calc(String txt){

        String[] array = txt.split(" ");

        int a = array[0].length();
        int b = array[2].length();
        int total = 0;

        if(txt.contains("+")) total += a + b;
        if(txt.contains("-")) total += a - b;
        if(txt.contains("*")) total += a * b;
        if(txt.contains("//")) total += (int)Math.floor(a / b);

        String result = "";

        while(total > 0){
            result += ".";
            total--;
        }

        return result;
    }
}