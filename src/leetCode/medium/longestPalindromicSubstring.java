package leetCode.medium;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    static final String input5 = "ccc"; //expect "bb"

    public static void main(String[] args) {
//        System.out.println(solution(input1));
//        System.out.println(solution(input2));
        System.out.println(solution(input3));
        System.out.println(solution(input4));
        System.out.println(solution(input5));
//        for (int i = 0; i < 5; i++) System.out.println(solution(RandomStringUtils.randomAlphanumeric(10)));

    }

    public static String solution(String s) {

        char startChar = '\0'; //시작문자
        char endChar = '\0'; //종료문자
        int betweenLength = 0; //문자 길이
        String answer = ""; //출력된 문자

        for (int i = 0; i < s.length(); i++) {
            startChar = s.charAt(i);

            // 다음 문자열부터 검사
            for (int j = i + 1; j < s.length(); j++) {
                endChar = s.charAt(j);

                if (startChar == endChar && (j - i + 1) > betweenLength) {
                    betweenLength = j - i + 1;
                    answer = s.substring(i, j + 1);
                    System.out.println("[i],[j] : " + i + "," + j + ", " + answer + "("+ betweenLength+")");
                    break;
                }
            }
        }

        return betweenLength <= 1 ? String.valueOf(startChar) : answer;
    }
}
