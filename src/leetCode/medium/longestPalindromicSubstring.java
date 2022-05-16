package leetCode.medium;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 *
 * LeetCode - Top 100 - Medium - 5. Longest Palindromic Substring
 *
 * 문제 설명
 * Given a string s, return the longest palindromic substring in s.
 *
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */


public class longestPalindromicSubstring {

    static final String input1 = "babad"; //expect "bab" or "aba"
    static final String input2 = "cbbd"; //expect "bb"

    public static void main(String[] args) {
        System.out.println(solution(input1));
        System.out.println(solution(input2));
    }

    public static int solution(String s) {
        int answer = 0;

        return answer;
    }
}
