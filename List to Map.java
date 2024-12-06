import java.util.*;

public class ListUtility {
    /**
     * Converts a list of integers into a frequency map.
     *
     * @param numbers (1,4,6,8,10,12,14,);
     * @return a map where keys are integers and values are their counts
     */
    public static Map<Integer, Integer> listToFrequencyMap(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer number : numbers) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        return frequencyMap;
    }
}