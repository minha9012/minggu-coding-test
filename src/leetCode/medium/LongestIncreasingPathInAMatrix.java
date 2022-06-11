package leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
 *
 * LeetCode - Top 100 - Medium - 329. Longest Increasing Path in a Matrix
 *
 * 문제 설명
 * Given an m x n integers matrix, return the length of the longest increasing path in matrix.
 *
 * From each cell, you can either move in four directions: left, right, up, or down. You may not move diagonally or move outside the boundary (i.e., wrap-around is not allowed).
 *
 *
 * Example 1:
 * Input: matrix = [[9,9,4],[6,6,8],[2,1,1]]
 * Output: 4
 * Explanation: The longest increasing path is [1, 2, 6, 9].
 *
 * Example 2:
 * Input: matrix = [[3,4,5],[3,2,6],[2,2,1]]
 * Output: 4
 * Explanation: The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.
 *
 * Example 3:
 * Input: matrix = [[1]]
 * Output: 1
 *
 * Constraints:
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 200
 * 0 <= matrix[i][j] <= 231 - 1
 */


public class LongestIncreasingPathInAMatrix {


    @Test
    void givenIntAndIntArray_whenTakeCourses_thenCorrect() {
        assertAll(
                () -> test(new int[][]{{9,9,4},{6,6,8},{2,1,1}}, 4),
                () -> test(new int[][]{{3,4,5},{3,2,6},{2,2,1}}, 4),
                () -> test(new int[][]{{1}}, 1)
        );
    }

    private void test(int[][] given, int expected) {
        // when
        int actual = LongestIncreasingPathInAMatrix.longestIncreasingPath(given);

        // then
        assertEquals(expected, actual);
    }

    //DAG(Directed Acyclic Graph)에 적용가능한 위상정렬(Topological Sort)로 접근
    public static int longestIncreasingPath(int[][] matrix) {
        return 1;
    }

}


