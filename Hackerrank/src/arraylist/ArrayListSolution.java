package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            ArrayList<Integer> sidelist = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                int element = in.nextInt();
                sidelist.add(j, element);
            }
            mainlist.add(sidelist);
        }
        int q = in.nextInt();
        for (int k = 0; k < q; k++) {
            int x = in.nextInt();
            int y = in.nextInt();
            try {
                System.out.println(mainlist.get(x-1).get(y-1)); //anything inside get
            }                                                   //always refers to index!
            catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        in.close();
    }
}
