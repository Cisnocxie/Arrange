import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

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


    @Test
    public void  should_return_catch_exception_when_input_string_witch_length_equals_0() {
        try {
            //given
            String input = "";

            //when
            List<String > results = Arrange.cal(input);

            //then
            fail("should input string length >= 1");
        } catch (Exception e) {

        }
    }




}
