package kyu8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

// https://www.codewars.com/kata/57f24e6a18e9fad8eb000296/train/java

public class Kata24 {
    @Test
    public void test1() {
        assertEquals(Sid.howMuchILoveYou(1), "I love you");
        assertEquals(Sid.howMuchILoveYou(2), "a little");
        assertEquals(Sid.howMuchILoveYou(6), "not at all");
    }
}

class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] phrases = new String[] {"not at all", "I love you", "a little", "a lot", "passionately", "madly", };
        return phrases[nb_petals % 6];
    }
}