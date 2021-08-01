


public class Encrypt {
    public  static  StringBuilder encryptClass(String message, int shift) {
        StringBuilder encryptedResult = new StringBuilder();


        if (shift > 25) {
            shift   = shift % 26;

        } else  if (shift < 0) {
            shift = (shift % 26) + 26;
        }
    }
}
