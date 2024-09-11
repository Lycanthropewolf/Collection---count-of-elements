import java.util.HashMap;
import java.util.Map;

public class ArrayUtils {

    public static <T> Map<T, Integer> countOccurrences(T[] array) {
        Map<T, Integer> occurrences = new HashMap<>();

        for (T element : array) {
            occurrences.put(element, occurrences.getOrDefault(element, 0) + 1);
        }

        return occurrences;
    }
}
