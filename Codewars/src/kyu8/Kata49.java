package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class Kata49 {
    @Test
    public void testSomething() {
        Integer[] args = new Integer[]{1,2};

        Swapper r= new Swapper(args);
        r.swapValues();
        assertEquals("Failed swapping numbers",2,r.arguments[0] );
        assertEquals("Failed swapping numbers",1,r.arguments[1] );
    }
}
class Swapper{
    final Object[] arguments;
    public Swapper(Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}