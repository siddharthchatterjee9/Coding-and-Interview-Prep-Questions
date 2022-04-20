package validusernamechecker;

import java.util.Scanner;

class UsernameValidator {
    public static final String regex = "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
public class ValidUsernameChecker {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        for (int n = Integer.parseInt(in.nextLine()); n > 0; n--) {
            String username = in.nextLine();
            if (username.matches(UsernameValidator.regex)) {
                System.out.print(username + " - ");
                System.out.println("Valid username.");
            }
            else {
                System.out.print(username + " - ");
                System.out.println("Invalid username!");
            }
        }
    }
}
