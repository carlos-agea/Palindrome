import org.junit.Assert;
import org.junit.Test;

import java.util.Set;

/**
 * Created by Agea111 on 09/06/2017.
 */
public class Tests {

    @Test
    public void findNoPalindrome() {
        Assert.assertEquals(0, Palindrome.firstThreeLongestPalindromes("asfdasdfasfw").size());
    }

    @Test
    public void findNoPalindromeWithEmptyString() {
        Assert.assertEquals(0, Palindrome.firstThreeLongestPalindromes("").size());
    }

    @Test
    public void findOneSinglePalindrome() {
        Assert.assertEquals(1, Palindrome.firstThreeLongestPalindromes("abba").size());
    }

    @Test
    public void findOneCenteredPalindrome() {
        Assert.assertEquals(1, Palindrome.firstThreeLongestPalindromes("abcycba").size());
    }

    @Test
    public void findThreeSinglePalindrome() {
        Assert.assertEquals(3, Palindrome.firstThreeLongestPalindromes("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop").size());
    }

    @Test
    public void matchThreeSinglePalindrome() {
        Set<String> results = Palindrome.firstThreeLongestPalindromes("sqrrqabccbatudefggfedvwhijkllkjihxymnnmzpop");
        Assert.assertTrue(results.contains("hijkllkjih"));
        Assert.assertTrue(results.contains("defggfed"));
        Assert.assertTrue(results.contains("abccba"));
    }

}
 