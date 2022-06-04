package varargs;

import java.util.Scanner;

class Add {
    public void add(int... intArgs) {
        int sum = 0;
        String separator = "";
        for (int i : intArgs) {
            sum += i;
            System.out.print(separator + i);
            separator = "+";
        }
        System.out.println("=" + sum);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        Add obj = new Add();
        obj.add(n1, n2);
        obj.add(n2, n3);
        obj.add(n1, n2, n3);
    }
}
