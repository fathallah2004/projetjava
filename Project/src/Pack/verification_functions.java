package Pack;

public class verification_functions {
    public static boolean verifEmail(String email){
        return email.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$") && !email.isEmpty() && email.indexOf('@') != -1 && email.indexOf('.') != -1;
    }
    public static boolean veriflogin(String login){
        return  login.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }
    public static boolean verifPassword(String password){
        return password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }
    public static boolean isNumber(String inputS) {
        try {
            Double.parseDouble(inputS);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static boolean verifyLicense(String input1S, String input2S) {
        int license1S, license2S;
        try {
            license1S = Integer.parseInt(input1S);
            license2S = Integer.parseInt(input2S);
        } catch (NumberFormatException ex) {
            return false;
        }

        return license1S >= 0 && license1S <= 400 && license2S >= 0 && license2S < 10000;
    }
}
