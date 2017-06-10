import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created by Agea111 on 09/06/2017.
 */
public class Tests {

    @Test
    public void isWordPalindrome() {
        Assert.assertTrue(Palindrome.isPalindrome("aBa"));
        Assert.assertTrue(Palindrome.isPalindrome("aBba"));
        Assert.assertTrue(Palindrome.isPalindrome("aa"));
        Assert.assertTrue(Palindrome.isPalindrome("aA"));
        Assert.assertTrue(Palindrome.isPalindrome("Aa"));
    }

    @Test
    public void isWordNotPalindrome() {
        Assert.assertFalse(Palindrome.isPalindrome(null));
        Assert.assertFalse(Palindrome.isPalindrome(""));
        Assert.assertFalse(Palindrome.isPalindrome("a"));
        Assert.assertFalse(Palindrome.isPalindrome("abc"));
    }

    @Test
    public void findNoPalindrome() {
        Assert.assertEquals(0, Palindrome.firstNLongestPalindromes("asfdasdfasfw", 3).size());
    }

    @Test
    public void findNoPalindromeWithEmptyString() {
        Assert.assertEquals(0, Palindrome.firstNLongestPalindromes("", 3).size());
    }

    @Test
    public void findOneSinglePalindrome() {
        Assert.assertEquals(1, Palindrome.firstNLongestPalindromes("abba", 3).size());
    }

    @Test
    public void findOneCenteredPalindrome() {
        Assert.assertEquals(1, Palindrome.firstNLongestPalindromes("abcycba", 3).size());
    }

    @Test
    public void findThreeSinglePalindrome() {
        Assert.assertEquals(3, Palindrome.firstNLongestPalindromes("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop", 3).size());
    }

    @Test
    public void matchThreeSinglePalindrome() {
        Set<String> results = Palindrome.firstNLongestPalindromes("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop", 3);
        Assert.assertTrue(results.contains("hijkllkjih"));
        Assert.assertTrue(results.contains("defggfed"));
        Assert.assertTrue(results.contains("abccba"));
    }

}
 