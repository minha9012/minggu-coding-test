package leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-peak-element/
 * <p>
 * LeetCode - Top 100 - Medium - 162. Find Peak Element
 * <p>
 * 문제 설명
 * A peak element is an element that is strictly greater than its neighbors.
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * You may imagine that nums[-1] = nums[n] = -∞.
 * You must write an algorithm that runs in O(log n) time.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: 2
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * <p>
 * Example 2:
 * Input: nums = [1,2,1,3,5,6,4]
 * Output: 5
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 * <p>
 * <p>
 * Constraints:
 * 1 <= nums.length <= 1000
 * -231 <= nums[i] <= 231 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */


public class FindPeakElement {

    @Test
    void givenIntArray_whenFindPeakElement_thenCorrect() {
        assertAll(
                () -> test_binarySearch(new int[]{1, 2, 3, 1}, 2),
                () -> test_binarySearch(new int[]{1, 2, 1, 3, 5, 6, 4}, 5)

        );
        assertAll(
                () -> test_findPeak(new int[]{1, 2, 3, 1}, 2),
                () -> test_findPeak(new int[]{1, 2, 1, 3, 5, 6, 4}, 5)
        );
    }

    private void test_binarySearch(int[] given, int expected) {
        // when
        int actual = FindPeakElement.binarySearch(given); //이진탐색

        // then
        assertEquals(expected, actual);
    }

    private void test_findPeak(int[] given, int expected) {
        // when
        int actual = FindPeakElement.findPeak(given, given.length); //분할정복

        // then
        assertEquals(expected, actual);
    }

    // 1. 이진 탐색(Binary Search)
    public static int binarySearch(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    // 2. 분할 정복 알고리즘(Divide and Conquer Algorithm)
    static int DAC(int[] nums, int left, int right, int length) {
        int mid = left + (right - left) / 2; //중앙값

        //중앙값과 이웃한 값들 비교
        if ((mid == 0 || nums[mid - 1] <= nums[mid])
                && (mid == length - 1 || nums[mid + 1] <= nums[mid]))
            return mid;

            // 중앙값이 극대값이 아니고, 왼쪽 이웃이 더 크다면 왼쪽 배열에 극대값이 존재
        else if (mid > 0 && nums[mid - 1] > nums[mid])
            return DAC(nums, left, (mid - 1), length);

            //아니라면 오른쪽 배열에 극대값 존재
        else return DAC(nums, (mid + 1), right, length);
    }

    //재귀 함수
    static int findPeak(int[] arr, int n) {
        return DAC(arr, 0, n - 1, n);
    }
}


