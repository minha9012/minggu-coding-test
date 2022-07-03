package leetCode.medium;

/**
 * https://leetcode.com/problems/word-search/
 *
 * LeetCode - Top 100 - Medium - 79. Word Search
 *
 * 문제 설명
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.
 *
 *
 *
 * Example 1:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
 * Output: true
 *
 * Example 2:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
 * Output: true
 *
 * Example 3:
 * Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
 * Output: false
 *
 * Constraints:
 * m == board.length
 * n = board[i].length
 * 1 <= m, n <= 6
 * 1 <= word.length <= 15
 * board and word consists of only lowercase and uppercase English letters.
 *
 *
 * Follow up: Could you use search pruning to make your solution faster with a larger board?
 */


public class WordSearch {

    static final String inputWord1 = "ABCCED";
    static final String inputWord2 = "SEE";
    static final String inputWord3 = "ABCB";
//    static final char[][] inputArr = {{"A","B","C","E"},{"S","F","C","S"},{"A","D","E","E"}}; //expect {0,1]

    public static void main(String[] args) {
//        System.out.println(solution(inputArr, inputWord1));
//        System.out.println(solution(inputArr, inputWord2));
//        System.out.println(solution(inputArr, inputWord3));
    }

    public static boolean solution(char[][] board, String word) {
        boolean answer = true;
        return answer;
    }
}
