public class BitwiseNOT {
    public static void main (String[] args) {
        int a = 5;
        // ~00000000 00000000 00000000 00000101 = 11111111 11111111 11111111 11111010
        // basically 1's complement of 5
        System.out.println("~a = " + ~a);
    }
}
