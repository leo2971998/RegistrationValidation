package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static boolean ValidateRegistrationNo(String registrationNo) {
        String regex = "^[A-Z]{2}\\s\\d{1,2}\\s[A-Z]{1,2}\\s\\d{1,4}$";
        Pattern p = Pattern.compile(regex);
        if (registrationNo == null){
            return false;
        }
        Matcher m = p.matcher(registrationNo);
        return m.matches();
    }
    public static String getResults(String registrationNo) {
        if (ValidateRegistrationNo(registrationNo)) {
            return "Registration No. is valid";
        }
        else return "Registration No. is invalid";
    }
}
