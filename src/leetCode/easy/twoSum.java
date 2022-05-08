package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/two-sum/
 *
 * LeetCode - Top 100 - Easy - 1. Two Sum
 *
 * 문제 설명
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 *
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 *
 *
 * Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?
 */


public class twoSum {

    static final int inputTarget1 = 9;
    static final int[] inputArr1 = {2,7,11,15}; //expect [0,1]
    static final int inputTarget2 = 6;
    static final int[] inputArr2 = {3,2,4}; //expect [1,2]
    static final int inputTarget3 = 6;
    static final int[] inputArr3 = {3,3}; //expect [0,1]

    public static void main(String[] args) {
        System.out.println(solution(inputArr1, inputTarget1));
        System.out.println(solution(inputArr2, inputTarget2));
        System.out.println(solution(inputArr3, inputTarget3));
    }

    public static int[] solution(int[] nums, int target) {
        int[] answer = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }
}
