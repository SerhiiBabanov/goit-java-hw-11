import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamUtils {
    //Task 1
    public List<String> getOddString(List<String> input) {
        return IntStream.range(0, input.size())
                .filter(n -> n % 2 != 0)
                .mapToObj(input::get)
                .toList();
    }

    //task 2
    public List<String> getUpperCaseDescendedOrder(List<String> input) {
        return input.stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
