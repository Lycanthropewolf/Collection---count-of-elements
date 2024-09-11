import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {"apple", "banana", "orange", "apple", "banana", "banana", "kiwi"};

        Map<String, Integer> fruitCount = ArrayUtils.countOccurrences(fruits);

        // Выводим элементы и их количество
        for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
