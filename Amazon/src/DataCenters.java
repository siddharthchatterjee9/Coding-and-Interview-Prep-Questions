import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {
    public static List<Integer> findDataLocations(List<Integer> locations, List<Integer> movedFrom, List<Integer> movedTo) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < movedFrom.size(); i++) {
            for (int j = 0; j < movedTo.size(); j++) {
                 {
                    
                }
            }
        }
        return movedTo;
    }
}

public class DataCenters {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> locations = new ArrayList<Integer>();
        locations.add(1);
        locations.add(7);
        locations.add(6);
        locations.add(8);

        ArrayList<Integer> movedFrom = new ArrayList<Integer>();
        movedFrom.add(1);
        movedFrom.add(7);
        movedFrom.add(2);


        ArrayList<Integer> movedTo = new ArrayList<Integer>();
        movedTo.add(2);
        movedTo.add(9);
        movedTo.add(5);
    }
}
