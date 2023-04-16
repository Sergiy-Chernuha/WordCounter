package global.goit;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "files/words.txt";
        MyFileReader mfr = new MyFileReader();
        List<String> words = mfr.readFile(fileName);
        Map<String, Integer> countResult = WordCounter.countWord(words);

        for (Map.Entry<String, Integer> entry : countResult.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
