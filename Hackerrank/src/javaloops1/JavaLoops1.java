package javaloops1;
import java.util.*;

public class JavaLoops1 {
    private static final Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++)
        {
            int result = N * i;
            System.out.printf("%d x %d = %d\n", N , i , result);
        }
        in.close();
    }
}
