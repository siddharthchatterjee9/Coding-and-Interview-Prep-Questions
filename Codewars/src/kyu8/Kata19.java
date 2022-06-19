package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

// https://www.codewars.com/kata/5951d30ce99cf2467e000013/train/java

public class Kata19 {
    static int[] p1={3,4,5};
    static int[] p2={3,5,7};

    PythagoreanTriple pT = new PythagoreanTriple();

    @Test
    public void validTriple() {
        assertEquals(1, pT.pythagoreanTriple(p1));
    }

    @Test
    public void invalidTriple(){
        assertEquals(0,pT.pythagoreanTriple(p2));
    }
}

class PythagoreanTriple {
    public int pythagoreanTriple(int[] triple){
        if (triple[0] * triple [0] + triple[1] * triple[1] == triple[2] * triple[2]) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
