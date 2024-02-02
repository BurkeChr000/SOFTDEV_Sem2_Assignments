import java.io.*;
import java.nio.file.*;

public class App {
    public static void main(String[] args) throws Exception {
        String fileName = "src/start.txt";
        Path newFilePath = Paths.get(fileName);

        try {
            Files.createFile(newFilePath);
        }   catch (FileAlreadyExistsException ex){
            System.out.println("FIle already exists");
        }

        File newFile
    }
}
