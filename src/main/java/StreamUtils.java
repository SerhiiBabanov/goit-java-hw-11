import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
    public String arraySort(String[] strings){
        return Arrays.stream(strings)
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(Integer::valueOf)
                .sorted(Integer::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }
}
