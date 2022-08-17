import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {
    public static void typeCounter(String sentence) {
        String[] vetStr = sentence.split("\\s+");

        List<Integer> listInt = new ArrayList<>();
        List<Float> listFloat = new ArrayList<>();
        List<String> listStr = new ArrayList<>();
        for (String s : vetStr) {
            try {
                listInt.add(Integer.parseInt(s));
            } catch (NumberFormatException exInt) {
                try {
                    listFloat.add(Float.parseFloat(s));
                } catch (NumberFormatException exFloat) {
                    listStr.add(s);
                }
            }
        }
        System.out.println(listInt.size());
        System.out.println(listFloat.size());
        System.out.println(listStr.size());
    }

}


public class TypeCounter {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}
