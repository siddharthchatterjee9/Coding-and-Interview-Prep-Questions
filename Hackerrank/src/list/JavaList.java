package list;

import java.util.*;

public class JavaList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List L = new ArrayList();
        for (int i = 0; i < N; i++) {
            L.add(i, in.nextInt());
        }
        int Q = in.nextInt();
        in.nextLine();
        for (int j = 0; j < Q; j++) {
            String query = in.nextLine();
            String value = in.nextLine();
            if (query.equals("Insert")) {
                String[] arr = value.split(" ");
                int index1 = Integer.parseInt(arr[0]);
                int element = Integer.parseInt(arr[1]);
                L.add(index1, element);
            }
            if (query.equals("Delete")) {
                int index2 = Integer.parseInt(value);
                L.remove(index2);
            }
        }
        Iterator itr = L.iterator();
        while (itr.hasNext()) {
            int x = (int) itr.next();
            System.out.print(x + " ");
        }
        in.close();
    }
}

