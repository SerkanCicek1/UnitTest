package Day3;

public class FirstTwoLastTwoSame {

    // !!! Task : ilk 2 ve son 2 karakteri ayni mi ??  BABA

    public boolean check_If_First_Two_Last_Two_Are_Same(String str) {

        if(str.length()<=1) return false;
        if(str.length()==2) return true;

        String firstTwoChars = str.substring(0,2); // AB
        String lastTwoChars = str.substring(str.length()-2);

        return firstTwoChars.equals(lastTwoChars);
    }
}