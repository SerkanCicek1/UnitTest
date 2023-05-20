package Day3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTwoLastTwoSameTest {

    FirstTwoLastTwoSame obj = new FirstTwoLastTwoSame();

    @ParameterizedTest
    @CsvSource(value = {"true, ABAB", "true, BABA","false, ABBA","true, AB","false, A"})
    void check_If_First_Two_Last_Two_Are_Same_Test(boolean rs, String str) {

        assertEquals(rs, obj.check_If_First_Two_Last_Two_Are_Same(str));

    }
}