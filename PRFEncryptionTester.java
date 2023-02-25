import static org.junit.Assert.assertEquals;
import org.junit.*;

public class PRFEncryptionTester{
    
    @Test
    public void testCorrectness(){
        PRFEncryption PRFScheme = new PRFEncryption();
        String message = "hello";
        String ciphertext = PRFScheme.Encrypt(message);
        String message_2 = PRFScheme.Decrypt(ciphertext);
        assertEquals(message, message_2);
    }
}