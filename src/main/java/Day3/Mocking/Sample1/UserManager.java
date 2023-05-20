package Day3.Mocking.Sample1;

public class UserManager {

    public String getUserName(int userId) {

        if(userId==1) {
            return "Fatih Deniz";
        } else if ( userId==2){
            return "Adam Born";
        } else {
            return "Unknown";
        }
    }
}