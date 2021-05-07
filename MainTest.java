import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainTest {
    private final Main testsMethod = new Main();

    @ParameterizedTest
    @MethodSource("getValueForMethodPullOutElemOfArr")
    void pullOutElemOfArr (int[] originalArray, int[] expectedResultArr){
        int[] actualResultArr=testsMethod.pullOutElemOfArr(originalArray);
        Assertions.assertArrayEquals(expectedResultArr,actualResultArr);
    }
    private static Stream<Arguments> getValueForMethodPullOutElemOfArr(){
        List<Arguments> arguments=new ArrayList<Arguments>(){{
        add(Arguments.arguments(new int[]{1,3,5,3,4,6,5}, new int[]{6, 5}));
        add(Arguments.arguments(new int[]{1,3,5,4,3,3,6,5}, new int[]{3,3,6,5}));
        add(Arguments.arguments(new int[]{4,4,4,4,5,4}, new int[]{}));
        add(Arguments.arguments(new int[]{4,3,5,3,6,5}, new int[]{3,5,3,6,5}));
        add(Arguments.arguments(new int[]{4,3,5,3,4,2,1554}, new int[]{2,1554}));
        }};
        return arguments.stream();
    }

    @Test
    void getValuesForPullOutElemOfArrWaitException() {
    int[] originalArray={5,6,9,8};
     Assertions.assertThrows(RuntimeException.class,
             ()-> testsMethod.pullOutElemOfArr(originalArray));

     int[] empty={};
     Assertions.assertThrows(RuntimeException.class,
             ()-> testsMethod.pullOutElemOfArr(empty));
    }

    @ParameterizedTest
    @MethodSource("getValueForMethodGetCheckElemOfArr")
    void pullOutElemOfArr (int[] originalArray, boolean expectedResultBool){
        boolean actualResultBool=testsMethod.getCheckElemOfArr(originalArray);
        Assertions.assertEquals(expectedResultBool,actualResultBool);
    }
    private static Stream<Arguments> getValueForMethodGetCheckElemOfArr(){
        List<Arguments> arguments=new ArrayList<Arguments>(){{
            add(Arguments.arguments(new int[]{1,4,1,1,4,1,1}, true));
            add(Arguments.arguments(new int[]{1,4,1,1,4,1,1,3}, false));
            add(Arguments.arguments(new int[]{1,1,1,1}, false));
            add(Arguments.arguments(new int[]{4,4,4,4,4,4}, false));
            add(Arguments.arguments(new int[]{4,1,1,1,1,1,1554}, false));
        }};
        return arguments.stream();
    }
}
