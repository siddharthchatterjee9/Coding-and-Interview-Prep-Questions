public class Solution10 {
    public static void main (String[] args) {
        int c = 0, d = 5, e = 10, a;
        a = c > 1 ? d > 1 || e > 1 ? 100 : 200 : 300;
        System.out.printf("a=%d", a);
    }
}
