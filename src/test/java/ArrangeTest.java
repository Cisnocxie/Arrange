import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrangeTest {


    @Test
    public void should_return_a_when_input_a(){
        //given
        String input = "a";

        //when
        List<String> results = Arrange.cal(input);

        //then
        assertEquals(results, Collections.singletonList("a"));
    }

    @Test
    public void  should_return_ab_ba_when_input_ab() {
        //given
        String input = "ab";

        //when
        List<String > results = Arrange.cal(input);

        //then
        assertEquals(results, Arrays.asList("ab", "ba"));
    }


    @Test
    public void  should_return_abc_acb_bac_bca_cab_cba_when_input_abc() {
        //given
        String input = "abc";

        //when
        List<String > results = Arrange.cal(input);

        //then
        assertEquals(results, Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba"));
    }
}
