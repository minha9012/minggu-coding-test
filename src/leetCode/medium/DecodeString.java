package leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/decode-string/
 *
 * LeetCode - Top 100 - Medium - 394. Decode String
 *
 * 문제 설명
 * Given an encoded string, return its decoded string.
 *
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 *
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 *
 * The test cases are generated so that the length of the output will never exceed 105.
 *
 * Example 1:
 * Input: s = "3[a]2[bc]"
 * Output: "aaabcbc"
 *
 * Example 2:
 * Input: s = "3[a2[c]]"
 * Output: "accaccacc"
 *
 * Example 3:
 * Input: s = "2[abc]3[cd]ef"
 * Output: "abcabccdcdcdef"
 *
 *
 * Constraints:
 * 1 <= s.length <= 30
 * s consists of lowercase English letters, digits, and square brackets '[]'.
 * s is guaranteed to be a valid input.
 * All the integers in s are in the range [1, 300].
 */


public class DecodeString {

    @Test
    void givenString_whenDecode_thenCorrect() {
        assertAll(
                () -> test("3[a]2[bc]", "aaabcbc"),
                () -> test("3[a2[c]]", "accaccacc"),
                () -> test("2[abc]3[cd]ef", "abcabccdcdcdef"),
                () -> test("abc3[cd]xyz", "abccdcdcdxyz")
        );
    }

    private void test(String given, String expected) {
        // when
        String actual = DecodeString.decodeString(given);

        // then
        assertEquals(expected, actual);
    }

    public static String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> countStack = new Stack<>(); //횟수 스택
        Stack<String> resultStack = new Stack<>(); //결과값 스택

        int index = 0;

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) { // 1. 숫자일 때, 반복해야 할 횟수를 스택에 저장
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0'); //자리수가 여러개라면,
                    index++;
                }
                countStack.push(count);

            } else if (s.charAt(index) == '[') { // 2. 문자가 "["일 때, 리턴 스택에 여태까지의 문자열 저장
                resultStack.push(result.toString());
                result = new StringBuilder();
                index++;

            } else if (s.charAt(index) == ']') { // 3. 문자가 "]"일 때, 스택을 pop하여 countStack의 top만큼 append
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int repeatTimes = countStack.pop();
                temp.append(result.toString().repeat(Math.max(0, repeatTimes)));
                result = new StringBuilder(temp.toString());
                index++;

            } else { // 4. 일반 문자일 경우 결과에 더해줌
                result.append(s.charAt(index));
                index++;
            }
        }

        return result.toString();
    }


}


