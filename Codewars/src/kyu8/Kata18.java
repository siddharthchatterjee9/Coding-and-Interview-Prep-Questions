package kyu8;

import org.junit.Test;

// https://www.codewars.com/kata/596c55fc7bd5476bf60000d5
public class Kata18 {
    @Test
    public void test() {
        System.out.println(Dinglemouse.INST.plus100(23));
    }
}

class Dinglemouse {
    // Initially, (i.e before the code change)
    // The value of 'ONE_HUNDRED' Variable was being assigned after the constructor creation
    // and hence the 'ONE_HUNDRED' variable was NOT Being assigned any value,
    // thereby keeping the 'value' variable's value to be 0 as well and
    // hence the resultant addition result was NOT Being achieved
    // Thus, now we would declare the value BEFORE Constructor creation so that,
    // whenever the constructor is created, the 'value' variable declared in it gets the value
    // of 'ONE_HUNDRED' Variable immediately i.e 100
    private static int ONE_HUNDRED = 100;
    public static final Dinglemouse INST = new Dinglemouse();
    private final int value;
    private Dinglemouse() {
        value = ONE_HUNDRED;
    }
    public int plus100(int n) {
        return value + n;
    }
}