public class ArithmeticRightShift {
    public static void main (String[] args) {
        int a = -5;
        // When shifting right with an arithmetic right shift,
        // the least-significant bit is lost
        // and the most-significant bit is copied.
        System.out.println(a >> 1);
    }
}
