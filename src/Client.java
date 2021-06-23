import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new FileReader("E:\\Module2-D16-ReadCSV\\src\\countries.csv"));
            while ((line = br.readLine()) != null){
                print(parseCSV(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null){
                    br.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static List<String> parseCSV(String csv) {
        List<String> result = new ArrayList<>();
        if (csv != null) {
            String[] split = csv.split(",");
            result.addAll(Arrays.asList(split));
        }
        return result;
    }

    private static void print(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name= " + country.get(2)
                        + "]");
    }
}
