package swing.operation;

/**
 *
 * @author Sohan_Maali
 */
public class Operation {

    public static String ganrateCapcha() {
        String s = "";
        String charector = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        for (int i = 1; i <= 6; i++) {
            int x = (int) ((Math.random() * 62) + 1);
            s += charector.charAt(x);
        }
        return s;
    }

    public static boolean checkGmail(String gmail) {
        int i = 0;
        for (; i < gmail.length(); i++) {
            if (gmail.charAt(i) == '@' && gmail.charAt(i + 6) == '.') {
                return true;
            }
        }
        return false;
    }

    public static boolean checkMobileNumber(String mobileNumber) {
        if (mobileNumber.length() != 10) {
            return false;
        }
        for (int i = 0; i < mobileNumber.length(); i++) {
            try {
                int n = mobileNumber.charAt(i) - '0';
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkZipCode(String zipCode) {
        if (zipCode.length() != 6) {
            return false;
        }
        for (int i = 0; i < zipCode.length(); i++) {
            try {
                int n = zipCode.charAt(i) - '0';
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
}
