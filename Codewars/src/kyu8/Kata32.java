package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/5556282156230d0e5e000089/train/java

public class Kata32 {
    @Test
    public void testDna() throws Exception {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() throws Exception {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}
class Bio {
    public String dnaToRna(String dna) {
        return dna.replaceAll("T", "U");
    }
}