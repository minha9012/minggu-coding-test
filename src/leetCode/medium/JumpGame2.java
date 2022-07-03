package leetCode.medium;

/**
 * https://leetcode.com/problems/jump-game-ii/
 *
 * LeetCode - Top 100 - Medium - 45. Jump Game II
 *
 * 문제 설명
 * Given an array of non-negative integers nums, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * You can assume that you can always reach the last index.
 *
 *
 *
 * Example 1:
 * Input: nums = [2,3,1,1,4]
 * Output: 2
 * Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 *
 * Example 2:
 * Input: nums = [2,3,0,1,4]
 * Output: 2
 * Constraints:
 *
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 1000
 */


public class JumpGame2 {

    static final int[] inputArr1 = {2,3,1,1,4}; //expect 2
    static final int[] inputArr2 = {2,3,0,1,4}; //expect 2

    public static void main(String[] args) {
        System.out.println(solution(inputArr1));
        System.out.println(solution(inputArr2));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for(int i=0;i<nums.length;i++){

        }



        return answer;
    }
}
