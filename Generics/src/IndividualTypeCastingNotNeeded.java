import java.util.ArrayList;

public class IndividualTypeCastingNotNeeded {
    public static void main (String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Siddharth");
        al.add("Ishan");
        // Typecasting is not needed
        String s1 = al.get(0);
        String s2 = al.get(1);
        System.out.println(s1 + "and" + s2);
    }
}
