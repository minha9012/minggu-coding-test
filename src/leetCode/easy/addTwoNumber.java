package leetCode.easy;

/**
 * https://leetcode.com/problems/add-two-numbers/
 * <p>
 * LeetCode - Top 100 - Easy - 2. Add Two Numbers
 * <p>
 * 문제 설명
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * <p>
 * Example 2:
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * <p>
 * Example 3:
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */


public class addTwoNumber {

    static final int[] input1L1 = {2, 4, 3};
    static final int[] input1L2 = {5, 6, 4}; //expect [7,0,8]
    static final int[] input2L1 = {0};
    static final int[] input2L2 = {0}; //expect [0]
    static final int[] input3L1 = {9,9,9,9,9,9,9};
    static final int[] input3L2 = {9,9,9,9}; //expect [8,9,9,9,0,0,0,1]

    public static void main(String[] args) {
//        System.out.println(addTwoNumbers(input1L1, input1L2));
//        System.out.println(addTwoNumbers(input2L1, input2L2));
//        System.out.println(addTwoNumbers(input3L1, input3L2));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();

        return answer;
    }


    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {this.val = val;}
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
