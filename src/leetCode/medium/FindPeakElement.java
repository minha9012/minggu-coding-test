package leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
                () -> test(new int[]{1, 2, 3, 1}, 2),
                () -> test(new int[]{1, 2, 1, 3, 5, 6, 4}, 5)
        );
    }

    private void test(int[] given, int expected) {
        // when
        int actual1 = FindPeakElement.binarySearch(given); //이진탐색
        int actual2 = FindPeakElement.findPeak(given, given.length); //분할정복

        // then
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
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
    static int findPeakUtil(
            int arr[], int low, int high, int n) {
        // Find index of middle element
        // low + (high - low) / 2
        int mid = low + (high - low) / 2;

        // Compare middle element with its
        // neighbours (if neighbours exist)
        if ((mid == 0 || arr[mid - 1] <= arr[mid])
                && (mid == n - 1 || arr[mid + 1] <= arr[mid]))
            return mid;

            // If middle element is not peak
            // and its left neighbor is
            // greater than it, then left half
            // must have a peak element
        else if (mid > 0 && arr[mid - 1] > arr[mid])
            return findPeakUtil(arr, low, (mid - 1), n);

            // If middle element is not peak
            // and its right neighbor
            // is greater than it, then right
            // half must have a peak
            // element
        else
            return findPeakUtil(
                    arr, (mid + 1), high, n);
    }

    // A wrapper over recursive function
    // findPeakUtil()
    static int findPeak(int arr[], int n) {
        return findPeakUtil(arr, 0, n - 1, n);
    }
}


