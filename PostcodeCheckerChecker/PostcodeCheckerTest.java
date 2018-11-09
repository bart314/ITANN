
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PostcodeCheckerTest {
    
 

    @Test
    public void shouldReturnTrueIsPCIsValid() {
        assertTrue(PostcodeChecker.validPostcode("9701 AA"));
        assertTrue(PostcodeChecker.validPostcode("9701aa"));
        assertTrue(PostcodeChecker.validPostcode("9701   AA"));
        assertTrue(PostcodeChecker.validPostcode("9741  aa   "));
        
        assertFalse(PostcodeChecker.validPostcode("0123 AA"));
        assertFalse(PostcodeChecker.validPostcode("1231231"));
        assertFalse(PostcodeChecker.validPostcode("ABCD 11"));
        assertFalse(PostcodeChecker.validPostcode("1234 11"));
        assertFalse(PostcodeChecker.validPostcode("123爱AA"));
    }
}
