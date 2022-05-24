import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamUtilsTest {
    private StreamUtils streamUtils;
    @BeforeEach
    void setUp() {
        streamUtils = new StreamUtils();
    }

    @Test
    void getOddString() {
        List<String> input = Arrays.asList("Vova", "Olha", "Ira", "Petro", "Yulia");
        List<String> expected = Arrays.asList("Olha","Petro");
        assertTrue(expected.equals(streamUtils.getOddString(input)));
    }

    @Test
    void getUpperCaseDescendedOrder() {
        List<String> input = Arrays.asList("Vova", "Olha", "Ira", "Petro", "Yulia");
        List<String> expected = Arrays.asList("YULIA","VOVA","PETRO","OLHA","IRA");
        List<String> result = streamUtils.getUpperCaseDescendedOrder(input);
        assertTrue(expected.equals(result));
    }

    @Test
    void arraySort() {
        String[] input = new String[]{"1, 2, 0", "4, 5"};
        String expected = "0, 1, 2, 4, 5";
        String result = streamUtils.arraySort(input);
        assertTrue(result.equals(expected));
    }
}