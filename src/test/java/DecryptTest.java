import org.junit.Test;
import static org.junit.Assert.assertNotNull;


public class DecryptTest {
    @Test
    public void testDecryptClass() {
        Decrypt classUnderTest = new Decrypt();
        assertNotNull("app should convert j to h when shift is 2",  classUnderTest.decryptClass("j ", 2));
        assertNotNull("app should convert jgnnq to hello when it shifts is 2", classUnderTest.decryptClass("jgnnq", 2));
    }
}
