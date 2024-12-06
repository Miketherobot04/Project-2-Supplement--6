import java.util.*;

public class ListUtility {
    /**
     *  Generates a list of random integers.
     *
     * @param size the size of the list to generate
     * @return a list of random integers
     * @throws IllegalArgumentException if the size is negative
     */
    public static List<Integer> generateRandomList(int size) {
        if (size < 0) throw new IllegalArgumentException("Size cannot be negative.");
        
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100)); // Range: 0–99
        }
        return randomList;
    }