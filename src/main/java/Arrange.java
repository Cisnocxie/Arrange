import java.util.Arrays;
import java.util.List;

public class Arrange {
    public static List<String> cal(String input) {
        return Arrays.asList(input, input.substring(1, 2) + input.substring(0, 1));
    }
}
