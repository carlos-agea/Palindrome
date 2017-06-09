import java.util.*;

/**
 * Created by Agea111 on 09/06/2017.
 */
public class Palindrome {

    /**
     * Find 3 longest unique palindromes in a supplied string
     *
     * @param str string to look in
     * @return set of results
     */
    public static Set<String> firstThreeLongestPalindromes(String str) {
        Set<String> results = new HashSet();
        for (int size = str.length(); size > 1; size--) {
            findPalindromesOfSize(str, size, results);
            if (results.size() >= 3) return results;
        }
        return results;
    }

    /**
     * Find unique palindromes of determined sized in a supplied string
     *
     * @param str     string to look in
     * @param size    palindrome size
     * @param results set of results
     */
    private static void findPalindromesOfSize(String str, int size, Set<String> results) {
        for (int pos = 0; (pos + size) <= str.length(); pos++) {
            if (!isContained(str.substring(pos, pos + size), results) && isPalindrome(str.substring(pos, pos + size))) {
                results.add(str.substring(pos, pos + size));
                System.out.println("Text: " + str.substring(pos, pos + size) + " , Index: " + pos + ", Length: " + size);
                if (results.size() >= 3) return;
            }
        }
    }

    /**
     * Check if a string is contained in a set of strings
     *
     * @param str the string to look for
     * @param set the set of strings to look in
     * @return
     */
    private static boolean isContained(String str, Set<String> set) {
        for (String entry : set) {
            if (entry.contains(str)) return true;
        }
        return false;
    }

    /**
     * Check if string is palindrome
     *
     * @param str the string
     * @return
     */
    private static boolean isPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) return false;

        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}