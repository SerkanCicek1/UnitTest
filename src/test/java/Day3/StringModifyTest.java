package Day3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringModifyTest {

    StringModify obj1 ;

    @BeforeEach
    void setUp(){
        obj1 = new StringModify();
        System.out.println(" BeforeEach calisti");
    }
    @AfterEach
    void tearDown(){
        obj1 = null ;
        System.out.println("AfterEach calisti");
    }

    @ParameterizedTest
    @CsvSource(value = {"BC, AABC", "BC, ABC", "BADFER, ABADFER"})
    void deleteIfItIsInFirstTwoPositionTest(String expexted, String actual){
        assertEquals(expexted, obj1.deleteIfItIsInFirstTwoPosition(actual));
    }

}