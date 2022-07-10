package leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/group-anagrams/
 *
 * LeetCode - Top 100 - Medium - 49. Group Anagrams
 *
 * 문제 설명
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 * Example 1:
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 *
 * Example 2:
 * Input: strs = [""]
 * Output: [[""]]
 *
 * Example 3:
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 *
 * Constraints:
 * 1 <= strs.length <= 104
 * 0 <= strs[i].length <= 100
 * strs[i] consists of lowercase English letters.
 */


public class GroupAnagrams {
/*
    @Test
    void givenString_whenDecode_thenCorrect() {
        List expected1 = new ArrayList<>();
        expected1.add({"bat"});
        expected1.add({"nat","tan"});
        expected1.add({"ate","eat","tea"})
        assertAll(
                () -> test(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"},
                        new List<List<String>>{  }
//                () -> test(new String[]{""}, "accaccacc"),
//                () -> test(new String[]{"a"}, "abcabccdcdcdef")
        );
    }

    private void test(String[] given, List<List<String>> expected) {
        // when
//        String actual = .decodeString(given);

        // then
        assertEquals(expected, actual);
    }

    static final String[] input1 = {"eat","tea","tan","ate","nat","bat"}; //expect [["bat"],["nat","tan"],["ate","eat","tea"]]
    static final String[] input2 = {""}; //expect [[""]]
    static final String[] input3 = {"a"}; //expect [["a"]]

    public static void main(String[] args) {
        System.out.println(solution(input1));
        System.out.println(solution(input2));
        System.out.println(solution(input3));
    }

    public static List<List<String>> solution(String[] strs) {

        return null;
    }

 */
}
