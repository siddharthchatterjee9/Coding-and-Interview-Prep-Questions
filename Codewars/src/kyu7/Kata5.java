package kyu7;

import org.junit.Test;

import java.time.LocalDate;

import static java.time.LocalDate.of;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Kata5 {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests dateNbDays");
        testing(DateDays.dateNbDays(4281, 5087, 2), "2024-07-03");
        testing(DateDays.dateNbDays(4620, 5188, 2), "2021-09-19");
        testing(DateDays.dateNbDays(9999, 11427, 6), "2018-03-13");
        testing(DateDays.dateNbDays(3525, 4822, 3), "2026-04-18");
        testing(DateDays.dateNbDays(5923, 6465, 6), "2017-06-10");
        testing(DateDays.dateNbDays(4254, 4761, 8), "2017-05-22");
        testing(DateDays.dateNbDays(1244, 2566, 4), "2033-11-04");
        testing(DateDays.dateNbDays(6328, 7517, 5), "2019-05-25");
        testing(DateDays.dateNbDays(2920, 3834, 2), "2029-06-03");
        testing(DateDays.dateNbDays(7792, 8987, 4), "2019-07-09");
    }
}

class DateDays {
    public static String dateNbDays(double a0, double a, double p) {
        return LocalDate.of(2016, 1, 1).plusDays((long) Math.ceil(Math.log(a / a0) / Math.log(1 + p / 36000))).toString();
    }
}