package Day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test01_Assertions {

    @Test
    public void test() {
        // main metodu yokken nasil calisti ???
        // JUnit icinde gomulu olarak gelen Main metodu cagriliyor..
        // Junit5 (Jupiter) metodl;arin erisim belirleyicisini public yapmaz zorunda degiliz
    }

    @Test
    public void testLength(){
        String cumle = "Merhaba Dunyam"; // 14 karakter
        int anlikDeger =  cumle.length();
        int beklenenDeger = 14 ;

        assertEquals(beklenenDeger,anlikDeger); // aldigi parametrelerin degerlerini karsilastirir , birbirine esit ise
        // test gecer

    }

    // !!! farkli bir ornek ( toUppercase() )
    @Test
    public void testUppercase(){

        String anlikDeger = "Merhaba".toUpperCase(); // MERHABA
        String beklenenDeger = "MERHABA";

        // testim hata verirse mesaj vermek istiyorsam :
        assertEquals(beklenenDeger,anlikDeger,"Uppercase metodu duzgun calismadi");
    }

    @Test
    public void testToplama() {

        int sayi1 = 10;
        int sayi2 = 5;
        int anlikDeger = Math.addExact(sayi1, sayi2); // 15
        int beklenenDeger = 15;

        assertEquals(beklenenDeger, anlikDeger);

    }

    @Test
    public void testContains(){

        assertEquals(false, "Mirac".contains("z"));
    }

}