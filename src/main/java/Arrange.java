import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arrange {
    public static List<String> cal(String input) {
        if (input.length() == 2) {
            return Arrays.asList(input, input.substring(1, 2) + input.substring(0, 1));
        } else if (input.length() ==1) {
            return Arrays.asList(input);
        } else {
            List<String> result = new ArrayList<>();
            result.add(input);
            result.add(input.substring(0, 1) + input.substring(2,3) + input.substring(1,2));
            result.add(input.substring(1, 2) + input.substring(0,1) + input.substring(2,3));
            result.add(input.substring(1, 2) + input.substring(2,3) + input.substring(0,1));
            result.add(input.substring(2, 3) + input.substring(0,1) + input.substring(1,2));
            result.add(input.substring(2, 3) + input.substring(1,2) + input.substring(0,1));
            return result;
        }
    }
}
