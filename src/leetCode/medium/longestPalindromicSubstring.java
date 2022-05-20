package leetCode.medium;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * <p>
 * LeetCode - Top 100 - Medium - 5. Longest Palindromic Substring
 * <p>
 * 문제 설명
 * Given a string s, return the longest palindromic substring in s.
 * <p>
 * <p>
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 * <p>
 * <p>
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 * <p>
 * Constraints:
 * 1 <= s.length <= 1000
 * s consist of only digits and English letters.
 */


public class longestPalindromicSubstring {

    static final String input1 = "babad"; //expect "bab" or "aba"
    static final String input2 = "cbbd"; //expect "bb"
    static final String input3 = "aacabdkacaa"; //expect "aca"
    static final String input4 = "bb"; //expect "bb"
    static final String input5 = "ccc"; //expect "ccc"

    public static void main(String[] args) {
        System.out.println(solution(input1));
        System.out.println(solution(input2));
        System.out.println(solution(input3));
        System.out.println(solution(input4));
        System.out.println(solution(input5));
        for (int i = 0; i < 5; i++) System.out.println(solution(
                RandomStringUtils.randomAlphanumeric(10).toLowerCase()));

    }

    public static String solution(String s) {

        String ret = "";
        for(int i=0 ; i<s.length() ; i++) {
            int len = Math.max(helper(s,i,i), helper(s,i,i+1));
            if(ret.length()<len) {
                ret = s.substring(i-(len-1)/2, i+len/2+1);
            }
        }
        return ret;
    }

    public static int helper(String str, int s, int e) {
        if(s<0 || e>=str.length()) return 0;
        while(s>=0 && e<str.length() && str.charAt(s)==str.charAt(e)) {
            s--;
            e++;
        }
        return e-s-1;
    }
}
