package Day1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Test04_BeforeAll_AfterAll {

    @BeforeAll
    static void beforeALL(){
        System.out.println("open a file");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("close a file");
    }

    @Test
    void testWithArrays(){

        String str ="Unit test with JUnit5";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Unit","test","with","JUnit5"};

        System.out.println("testWithArrays() calisti");

        assertArrayEquals(beklenenDizi, anlikDizi, "Diziler esit degil");
    }

    @Test
    void testWithArrays2(){

        String str ="Unit test with JUnit5";
        String[] anlikDizi = str.split(" ");
        String[] beklenenDizi = {"Unit","test","with","JUnit5"};

        System.out.println("testWithArrays2() calisti");

        assertArrayEquals(beklenenDizi, anlikDizi, "Diziler esit degil");
    }

}