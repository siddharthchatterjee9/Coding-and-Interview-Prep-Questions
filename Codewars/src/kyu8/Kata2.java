package kyu8;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata2 {
    @Test
    public void testFixed() {
        assertEquals("S.H", SolutionTest.abbrevName("Sam Harris"));
        assertEquals("P.F", SolutionTest.abbrevName("Patrick Feenan"));
        assertEquals("E.C", SolutionTest.abbrevName("Evan Cole"));
        assertEquals("P.F", SolutionTest.abbrevName("P Favuzzi"));
        assertEquals("D.M", SolutionTest.abbrevName("David Mendieta"));
    }
}
class SolutionTest {
    public static String abbrevName(String name) {
        //return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}