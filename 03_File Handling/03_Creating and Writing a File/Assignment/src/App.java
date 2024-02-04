import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class App {
    public static void main(String[] args) throws Exception {
        File file = new File("Assignment/src/end.txt");
        if(file.createNewFile()){
            System.out.println("File created");
        } else { System.out.println("Couldn't create file"); }

        BufferedReader reader = new BufferedReader(new FileReader("Assignment/src/start.txt"));
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        for(int i = 0; i < 3; i++){
            printWriter.println(reader.readLine());
        }

        printWriter.close();
        reader.close();
    }
}
