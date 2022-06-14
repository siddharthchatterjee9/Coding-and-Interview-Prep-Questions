package sha256;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

/* This code was written by Siddharth Chatterjee */

public class Main {
    public static void main (String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        MessageDigest m = MessageDigest.getInstance("SHA-256");
        m.reset();
        m.update(in.nextLine().getBytes());
        for (byte i: m.digest()) {
            System.out.printf("%02x", i);
        }
    }
}
