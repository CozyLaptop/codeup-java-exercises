import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.*;
import java.util.Arrays;
import java.util.List;

public class Exceptions {
    public static void main(String[] args) {
        Path pathToOurDataDir = Paths.get("src/data");
        System.out.println(pathToOurDataDir);
        System.out.println();
        Path pathToOurFile = Paths.get("src/data", "list.txt");
        List<String> food = Arrays.asList("Milk", "Eggs", "Candy");
        try {
            Files.createDirectories(pathToOurDataDir);
            if(Files.notExists(pathToOurFile)){
                Files.createFile(pathToOurFile);
            } else {
                System.out.println("The " + pathToOurFile + " file already exists");
            }
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        try {
            Files.write(pathToOurFile, food);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
