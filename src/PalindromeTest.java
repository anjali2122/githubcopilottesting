import junit.framework.TestCase;
import org.junit.Test;

public class PalindromeTest extends TestCase {

    @Test
    public void testIsPalindrome() {
        Palindrome p = new Palindrome();
        assertTrue(p.isPalindrome("NOON"));
        assertFalse(p.isPalindrome("NOOO"));
    }

    @Test
    public void testRemoveSubstring() {
        Palindrome p = new Palindrome();
        assertEquals("Hello", p.removeSubstring("Hello World", " World"));
    }

    @Test
    public void testCountSubstring() {
        Palindrome p = new Palindrome();
        assertEquals(3, p.countSubstring("Hello World", "l"));
    }
}