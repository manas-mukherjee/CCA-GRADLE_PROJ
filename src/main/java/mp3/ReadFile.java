package mp3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReadFile {

    public static void main(String args[]){

        String arr[] = {"row1","row2",
                "row3",
                "row4",
                "row5",
                "row6",
                "row7",
                "row8",
                "row9",
                "row10",
                "row11",
                "row12",
                "row13",
                "row14",
                "row15",
                "row16",
                "row17",
                "row18",
                "row19",
                "row20",
                "row21",
                "row22",
                "row23",
                "row24",
                "row25"};

        List<String> rowKeys = Arrays.asList(arr);
        System.out.println(rowKeys);
        java.util.Collections.sort(rowKeys);
        System.out.println(rowKeys);

        Map<String, Integer> testMap = new TreeMap<>();
        for ( String a : arr){
            System.out.println(a);
            testMap.put(a, 1);
        }

        System.out.println(testMap.keySet());

//        BufferedReader reader;
//
//        String line = null;
//        try {
//            reader = new BufferedReader(new FileReader("./input.csv"));
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
//            reader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
