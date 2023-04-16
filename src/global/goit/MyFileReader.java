package global.goit;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MyFileReader {
    public List<String> readFile(String fileName) {
        List<String> result = new ArrayList<>();

        try (FileReader fileReader = new FileReader(fileName)) {
            Scanner scanner = new Scanner(fileReader);

            while (scanner.hasNext()) {
                String oneLine = scanner.nextLine();
                String[] words = oneLine.split(" ");

                Collections.addAll(result, words);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
