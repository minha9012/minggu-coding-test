package leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-peak-element/
 *
 * LeetCode - Top 100 - Medium - 162. Find Peak Element
 *
 * 문제 설명
 * A peak element is an element that is strictly greater than its neighbors.
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞.
 * You must write an algorithm that runs in O(log n) time.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 *
 * Example 2:
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 *
 *
 * Constraints:
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */


public class FindPeakElement {

    @Test
    void givenIntArray_whenFindPeakElement_thenCorrect() {
        assertAll(
                () -> test(new int[]{1,2,3,1},2),
                () -> test(new int[]{1,2,1,3,5,6,4},5)
        );
    }

    private void test(int[] given, int expected) {
        // when
        int actual = FindPeakElement.solution(given);

        // then
        assertEquals(expected, actual);
    }

    public static int solution(int[] nums){



        return 1;
    }


}


