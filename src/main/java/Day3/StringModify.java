package Day3;

public class StringModify {

    // Task : kelimenin ilk 2 harf icerisinde A varsa silinsin (kelime içindeki harflerin hepsi büyük olacak)
    // AABC --> BC  , ABC --> BC , A  --> "" , AA --> ""

    public String deleteIfItIsInFirstTwoPosition(String str) { //A

        if(str.length()<=2){ // A
            return str.replace("A", "");
        }

        String firstTwoChars = str.substring(0,2); // AABCDAVG --> AA
        String afterFirstTwoChars = str.substring(2); // AABCDAVG --> BCDAVG

        return firstTwoChars.replaceAll("A", "") + afterFirstTwoChars ;

    }
}