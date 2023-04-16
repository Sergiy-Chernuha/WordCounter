package global.goit;

import java.util.*;

public class WordCounter {
    public static Map<String, Integer> countWord(List<String> words) {
        Map<String, Integer> countResult = new HashMap<>();

        for (String word : words) {
            if (countResult.containsKey(word)) {
                countResult.put(word, countResult.get(word) + 1);
            } else {
                countResult.put(word, 1);
            }
        }

        return sortMap(countResult);
    }

    private static Map<String, Integer> sortMap(Map<String, Integer> countResult) {
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(countResult.entrySet());

        entries.sort(Map.Entry.comparingByValue());
        Collections.reverse(entries);
        for (Map.Entry<String, Integer> entry : entries) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
