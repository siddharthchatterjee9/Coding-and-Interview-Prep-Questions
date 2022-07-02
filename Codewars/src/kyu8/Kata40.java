package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/57126304cdbf63c6770012bd/train/java
// S. Chatterjee

public class Kata40 {
    MyUtilities myUtil = new MyUtilities();

    @Test
    public void test0() throws Exception
    {
        assertEquals(false,myUtil.isDigit("s2324"));
    }
    @Test
    public void test1() throws Exception
    {
        assertEquals(true,myUtil.isDigit("-234.4"));
    }
}

class MyUtilities {
    public boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}