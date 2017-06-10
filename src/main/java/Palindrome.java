import java.util.*;

/**
 * Created by Agea111 on 09/06/2017.
 */
public class Palindrome {

    /**
     * Find first N longest palindromes in a supplied string
     *
     * @param str string to look in
     * @param n   number of results to find
     * @return set of results
     */
    public static Set<String> firstNLongestPalindromes(String str, int n) {
        if (str == null || n == 0) return Collections.emptySet();

        Set<String> results = new HashSet();
        for (int size = str.length(); size > 1; size--) {
            findPalindromesOfSize(str, size, results, n);
            if (results.size() >= n) return results;
        }
        return results;
    }

    /**
     * Find unique palindromes of determined sized in a supplied string
     *
     * @param str     string to look in
     * @param size    palindrome size to look for
     * @param results set of results
     * @param n       number of results to find
     */
    private static void findPalindromesOfSize(String str, int size, Set<String> results, int n) {
        for (int pos = 0; (pos + size) <= str.length(); pos++) {
            if (!isContained(str.substring(pos, pos + size), results) && isPalindrome(str.substring(pos, pos + size))) {
                results.add(str.substring(pos, pos + size));
                System.out.println("Text: " + str.substring(pos, pos + size) + " , Index: " + pos + ", Length: " + size);
                if (results.size() >= n) return;
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
    static boolean isContained(String str, Set<String> set) {
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
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0 || str.length() == 1) return false;

        for (int i = 0; i < str.length() / 2; i++) {
            if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}