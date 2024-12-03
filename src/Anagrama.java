import java.io.*;
import java.util.*;

public class Anagrama {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader("files/spanish-dict.txt"));
        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        reader.close();
    }
}
