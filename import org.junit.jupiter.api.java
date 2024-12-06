import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

class ListUtilityTest {

    @Test
    void testGenerateRandomList() {
        List<Integer> randomList = ListUtility.generateRandomList(10);
        assertEquals(10, randomList.size());
    }

    @Test
    void testListToFrequencyMap() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 3);
        Map<Integer, Integer> frequencyMap = ListUtility.listToFrequencyMap(numbers);
        assertEquals(1, frequencyMap.get(1));
        assertEquals(2, frequencyMap.get(2));
        assertEquals(3, frequencyMap.get(3));
    }

    @Test
    void testSortListAscending() {
        List<Integer> numbers = Arrays.asList(3, 1, 2);
        ListUtility.sortListAscending(numbers);
        assertEquals(Arrays.asList(1, 2, 3), numbers);
    }
}