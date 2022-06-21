package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata20 {
    @Test
    public void basicTests() {
        assertEquals("One", SwitchItUp.switchItUp(1));
        assertEquals("Three", SwitchItUp.switchItUp(3));
        assertEquals("Five", SwitchItUp.switchItUp(5));
    }
}
class SwitchItUp {
    public static String switchItUp(int number) {
        switch(number){
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }
        return null;
        // return new String[] {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"}[number];
    }
}