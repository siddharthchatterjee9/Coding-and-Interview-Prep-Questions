public class BitwiseOR {
    public static void main (String[] args) {
        int a = 5;
        int b = 7;
        // bitwise or
        // 5 = 0101  ---  7 = 0111 (binary representation)
        //    0101
        // OR 0111
        // _________
        //    0111
        System.out.println("a OR b = " + (a | b));
    }
}
