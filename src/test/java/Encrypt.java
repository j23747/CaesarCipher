import org.junit.Test;
import static org.junit.Assert.*;


public class Encrypt {
    @Test
    public void testEncryptClass() {
        Encrypt classUnderTest = new Encrypt();
        assertNotNull("app should convert a c when shift is 2", classUnderTest.encryptClass("A", 2));
        assertNotNull("app should convert hello to jgnnq when shift is 2", classUnderTest.encryptClass("A", 2));





    }
}
