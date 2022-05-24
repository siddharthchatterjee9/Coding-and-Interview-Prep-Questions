package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMapSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        Map<String, String> m = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            String number = in.next();
            m.put(name, number);
        }
        while (in.hasNext()) {
            String query = in.nextLine();
            if (m.containsKey(query)) {
                System.out.println(query + " " + m.get(query));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
