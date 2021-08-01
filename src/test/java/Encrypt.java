import org.junit.Test;

public class Encrypt {
    @Test
    public void checkWhetherInputIsString() {
        Encrypt classUnderTest = new Encrypt();
        assertNotNull("app should convert a c when shift is 2", classUnderTest.encryptClass("A", 2));




    }
}
