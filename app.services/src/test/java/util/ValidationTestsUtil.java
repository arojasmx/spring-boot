package util;

/**
 * Created by arojas on 18/01/2017.
 */
public class ValidationTestsUtil {

    public static String stringOverMaxLength(int length) {
        String result = "";
        for (int i = 0; i <= length; i++) {
            result += "x";
        }
        return result;
    }

}
