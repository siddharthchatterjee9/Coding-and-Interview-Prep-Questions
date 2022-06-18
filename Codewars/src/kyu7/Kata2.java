package kyu7;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static java.util.stream.Stream.of;

public class Kata2 {
    @Test
    public void on(){
        assertEquals(1, Shifter.count("ON"));
    }
    @Test
    public void osIsUpdated(){
        assertEquals(2, Shifter.count("OS IS UPDATED"));
    }
    @Test
    public void whoIsWho(){
        assertEquals(2, Shifter.count("WHO IS WHO"));
    }
    @Test
    public void js(){
        assertEquals(0, Shifter.count("JS"));
    }
    @Test
    public void iIiiIIii(){
        assertEquals(2, Shifter.count("I III I III"));
    }
    @Test
    public void empty(){
        assertEquals(0, Shifter.count(""));
    }
}


class Shifter {
    public static int count(String phrase) {
        // return (int) of(st.split(" ")).distinct().filter(w -> w.matches("[HIMNOSWXZ]+")).count();
        if (phrase.equals("")) {
            return 0;
        }
        int num = 0;
        String check = "HINOSXZMW";
        String[] arr = phrase.split(" ");
        Set<String> targetSet = new HashSet<>(Arrays.asList(arr));
        String[] arrOfString = new String[targetSet.size()];
        arrOfString = targetSet.toArray(arrOfString);
        for (int i = 0; i < arrOfString.length; i++) {
            for (int j = 0; j < arrOfString[i].length(); j++) {
                if (!check.contains(Character.toString(arrOfString[i].charAt(j)))) {
                    break;
                }
                if (j == arrOfString[i].length() - 1) {
                    num++;
                }
            }
        }
        return num;
    }
}