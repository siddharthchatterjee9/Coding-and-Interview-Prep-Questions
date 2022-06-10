package md5;
// MD5 (Message-Digest algorithm 5) is a widely-used cryptographic hash function
// with a 128-bit hash value.
// Here are some common uses for MD5:
// To store a one-way hash of a password.
// To provide some assurance that a transferred file has arrived intact.
// MD5 is one in a series of message digest algorithms
// designed by Professor Ronald Rivest of MIT (Rivest, 1994);
// however, the security of MD5 has been severely compromised,
// most infamously by the Flame malware in.
// The CMU Software Engineering Institute essentially considers MD5 to be
// "cryptographically broken and unsuitable for further use".
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) throws NoSuchAlgorithmException {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        in.close();
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        for (byte b: digest) {
            System.out.printf("%02x", b);
        }
    }
}
