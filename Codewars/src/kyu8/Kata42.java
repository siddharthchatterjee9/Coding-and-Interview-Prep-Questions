package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// https://www.codewars.com/kata/56f6919a6b88de18ff000b36/train/java

public class Kata42 {
    @Test
    public void basicTests() {
        assertEquals("More than a handful!",ZywOo.howManyDalmatians(26));
        assertEquals("Hardly any" ,ZywOo.howManyDalmatians(8));
        assertEquals("More than a handful!" ,ZywOo.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!" ,ZywOo.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!" ,ZywOo.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!" ,ZywOo.howManyDalmatians(101));
    }
}

class ZywOo {
    public static String howManyDalmatians(int number) {
        String[] dogs = {"Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};
        if (number <= 10) {
            return dogs[0];
        }
        else if (number <= 50) {
            return dogs[1];
        }
        else if (number <= 100) {
            return dogs[2];
        }
        return dogs[3];
    }
}