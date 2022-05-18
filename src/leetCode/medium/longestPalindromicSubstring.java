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
        for(int i=0;i<input.length();i++){
            System.out.println(input.charAt(i));
        }

        /*

        HashMap<Character, Integer> hm = new HashMap();

        // 1. hashMap에  담기
        for (int i = 0; i < input.length(); i++)
            hm.put(input.charAt(i), hm.getOrDefault(input.charAt(i), 0) + 1); //key값 먼저 담기

        // 2. 빈도순 기준으로 내림차순 알파벳 정렬
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // 3. value 만큼 key 반복해 String 으로
        StringBuilder answer = new StringBuilder();
        for (Map.Entry<Character, Integer> characterIntegerEntry : entryList)
            answer.append(String.valueOf(characterIntegerEntry.getKey()).repeat(Math.max(0, characterIntegerEntry.getValue())));

//        String answer = entryList.stream().map(Entry::getKey).collect(Collectors.toList()) //entry keySet to Char List
//                .stream().map(String::valueOf).collect(Collectors.joining()); // Char List to String

         */
        return "finish";
    }
}
