package CaesarCipher;

public class Decrypt {
    public static StringBuilder decryptClass(String decMessage, int decShift) {
        StringBuilder decryptedResult = new StringBuilder();

        if (decShift > 26) {
            decShift = decShift % 26;
        } else if (decShift < 0) {
            decShift = (decShift % 26) + 26;
        }


        for (int i = 0; i < decMessage.length(); i++) {
            if (Character.isUpperCase(decMessage.charAt(i))) {
                char character = (char) (((int) decMessage.charAt(i) -
                        decShift - 65) % 26 + 65);
                decryptedResult.append(character);
            } else {
                char character = (char) (((int) decMessage.charAt(i) -
                        decShift - 97) % 26 + 97);
                decryptedResult.append(character);
            }

        }

        return decryptedResult;
    }

}
