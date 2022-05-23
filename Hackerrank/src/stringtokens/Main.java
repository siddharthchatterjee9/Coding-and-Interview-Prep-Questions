package stringtokens;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] tokens = s.split("[^a-zA-Z]");
        int numOfTokens = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() > 0) {
                numOfTokens++;
            }
        }
        System.out.println(numOfTokens);
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() > 0) {
                System.out.println(tokens[i]);
            }
        }
    }

}
