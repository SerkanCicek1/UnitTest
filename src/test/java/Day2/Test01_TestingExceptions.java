package Day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test01_TestingExceptions {

    // !!! test ettigimiz method bekledigimiz exceptioni firlatti mi ???

    @Test
    void testException(){

        String str = "Merhaba Dunya"; // 13

        assertThrows(NullPointerException.class, ()-> {
            System.out.println("testException() calisti");
            str.length();
        });
    }


    // !!! bolme islemi icin ArithmeticException kontrolu

    @Test
    void testException2(){
        int sayi1 = 1;
        int sayi2 = 0;

        // !!! parent class i yazarsakda test gecer --> RunTimeException
        assertThrows(ArithmeticException.class, ()-> {
            System.out.println(sayi1/sayi2);
        });
    }

    // !!! yukardaki senaryoyu method ekleyerek yapalim

    @Test
    void testException3(){

        int sayi1 = 1 ;
        int sayi2 = 0 ;

        assertThrows(ArithmeticException.class , ()-> {
            divide(sayi1,sayi2);
        });

    }

    private int divide( int a, int b) {
        return a/b ;
    }
}