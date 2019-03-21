package mp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String args[]){
        BufferedReader reader;

        String line = null;
        try {
            reader = new BufferedReader(new FileReader("./input.csv"));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
