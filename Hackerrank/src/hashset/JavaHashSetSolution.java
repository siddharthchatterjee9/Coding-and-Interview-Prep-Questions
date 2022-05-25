package hashset;

import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSetSolution {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        String[] left_pair_pos = new String[t];
        String[] right_pair_pos = new String[t];
        for (int i = 0; i < t; i++) {
            left_pair_pos[i] = in.next();
            right_pair_pos[i] = in.next();
        }
        HashSet<String> pairs = new HashSet<String>(t);
        for (int j = 0; j < t; j++) {
            pairs.add("(" + left_pair_pos[j] + ", " + right_pair_pos[j] + ")" );
            System.out.println(pairs.size());
        }
        //System.out.println(pairs);
    }
}
