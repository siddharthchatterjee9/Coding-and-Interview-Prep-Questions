package anagrams;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isAnagram(String a, String b) {
        Boolean retvalue = false;
        if (a!= null && b!= null) {
            if (a.length() != b.length()) {
                return false;
            }
            char[] arr = a.toLowerCase().toCharArray();
            char[] brr = b.toLowerCase().toCharArray();
            Arrays.sort(arr);
            Arrays.sort(brr);
            retvalue = Arrays.equals(arr, brr);
        }
        return retvalue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        in.close();
        boolean res = isAnagram(a, b);
        System.out.println( (res)? "Anagrams":"Not Anagrams");

    }
}
