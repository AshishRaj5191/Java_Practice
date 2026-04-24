package inClass_assignment_1.bank_app.util;

public class Validator {

    public static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");
    }

    public static boolean isValidPin(String pin, String dob) {
        return pin.length() == 4 && !pin.equals(dob.replace("/", ""));
    }
}
