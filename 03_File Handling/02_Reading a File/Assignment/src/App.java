import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/file.txt";

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        System.out.println(reader.readLine());
        reader.close();
    }
}
