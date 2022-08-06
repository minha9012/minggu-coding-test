package leetCode.medium;

/**
 * https://leetcode.com/problems/word-search/
 *
 * LeetCode - Top 100 - Medium - 11. Container With Most Water
 *
 * 문제 설명
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Constraints:
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 */


public class ContainerWithMostWater {

    static final int[] inputArr1 = {1,8,6,2,5,4,8,3,7}; //expect 49
    static final int[] inputArr2 = {1,1}; //expect 1

    public static void main(String[] args) {
        System.out.println(solution(inputArr1));
        System.out.println(solution(inputArr2));
    }

    public static int solution(int[] height) {
        int answer = 0;

        return answer;
    }
}
