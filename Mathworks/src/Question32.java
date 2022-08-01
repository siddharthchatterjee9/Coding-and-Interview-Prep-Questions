public class Question32 {
    static int[] a;
    static {
        a[0] = 2;
    }
    public static void main (String[] args) {
        //System.out.println(Question32.a[0]);
        System.out.println(new Question32().a[0]);
        System.out.println(a[0]);
    }
}
