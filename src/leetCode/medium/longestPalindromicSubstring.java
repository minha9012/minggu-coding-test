package leetCode.medium;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        for (int i = 0; i < 5; i++) {
//            System.out.println(solution(RandomStringUtils.randomAlphabetic(10)));
        }
    }

    public static String solution(String input) {

        char startStr = '\0'; //시작문자
        char endStr = '\0'; //종료문자
        int betweenLength = 0;

        for(int i=0;i<input.length();i++){
            startStr = input.charAt(i);

            // index 마지막에서부터 같은 문자를 찾는다.
            for(int j= input.length()-1; j > 0;j--){
                endStr = input.charAt(j);

                System.out.println("start : " + startStr + ", end : " + endStr);

                if( startStr == endStr){
                    betweenLength = Math.max(betweenLength, j-i);
                    System.out.println("between : " + betweenLength);
                    break;
                }

            }

            System.out.println(input.charAt(i));

        }

        return "finish";
    }
}
