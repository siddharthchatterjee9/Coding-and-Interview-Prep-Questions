package kyu8;

import org.junit.jupiter.api.Test;
import java.util.Random;

public class Kata48 {
    @Test
    void testSomething() {
        // assertEquals("expected", "actual");
    }
}
class Ghost {
    String[] colors = {"yellow", "white", "purple", "red"};
    String color = "";
    public Ghost() {
        color = colors[new Random().nextInt(colors.length)];
    }
    public String getColor() {
        return color;
    }
}