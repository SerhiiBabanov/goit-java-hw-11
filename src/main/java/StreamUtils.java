import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
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

    //task 3
    public String arraySort(String[] strings) {
        return Arrays.stream(strings)
                .flatMap(s -> Stream.of(s.split(", ")))
                .map(Integer::valueOf)
                .sorted(Integer::compareTo)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    //task 4
    public Stream<Long> getStreamRandomLong(Long seed, Long a, Long c, Long m) {
        return Stream.iterate(new Long[]{seed, a, c, m}, n -> new Long[]{(n[1] * n[0] + n[2]) % n[3], n[1], n[2], n[3]}).map(n -> n[0]);
    }
    //task 5
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> iteratorFirst = first.iterator();
        Iterator<T> iteratorSecond = second.iterator();
        Stream<T> resultStream = Stream.empty();
        while (iteratorFirst.hasNext() && iteratorSecond.hasNext()){
            resultStream = Stream.concat(resultStream, Stream.of(iteratorFirst.next(), iteratorSecond.next()));
        }
        return resultStream;
    }
}
