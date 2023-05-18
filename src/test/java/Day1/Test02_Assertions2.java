package Day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test02_Assertions2 {

    // !!! bazen yapacagim testlerde "Bu dogru degil mi" seklinde kontroller yapmam gerekirse :

    @Test
    public void testToFindMin(){

        assertTrue(Math.min(4,10)==4);
        assertFalse(Math.min(4,10)==10);
    }

    @Test
    public void testSplit(){

        String str = "Test islemi cok kolay";
        String[] anlikDizi = str.split(" "); //{"Test", "islemi", "cok", "kolay"}
        String[] beklenenDizi = {"Test", "islemi", "cok", "kolay"};

        assertTrue(Arrays.equals(beklenenDizi,anlikDizi));
    }

}