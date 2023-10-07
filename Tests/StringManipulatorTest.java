import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    @Test
    public void testReverse() {
        String input = "hello";
        String expected = "olleh";
        String actual = StringManipulator.reverse(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsPalindrome() {
        String palindrome = "racecar";
        assertTrue(StringManipulator.isPalindrome(palindrome));

        String notPalindrome = "hello";
        assertFalse(StringManipulator.isPalindrome(notPalindrome));
    }

    @Test
    public void testCountOccurrences() {
        String str = "programming";
        char character = 'g';
        int expectedCount = 2;
        int actualCount = StringManipulator.countOccurrences(str, character);
        assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testConcatenate() {
        String str1 = "Hello, ";
        String str2 = "World!";
        String expected = "Hello, World!";
        String actual = StringManipulator.concatenate(str1, str2);
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsSubstring() {
        String str = "Hello, World!";
        String substring1 = "World";
        assertTrue(StringManipulator.containsSubstring(str, substring1));

        String substring2 = "Universe";
        assertFalse(StringManipulator.containsSubstring(str, substring2));
    }

    @Test
    public void testStartsWithPrefix() {
        String str = "Hello, World!";
        String prefix1 = "Hello";
        assertTrue(StringManipulator.startsWithPrefix(str, prefix1));

        String prefix2 = "Hi";
        assertFalse(StringManipulator.startsWithPrefix(str, prefix2));
    }
}
