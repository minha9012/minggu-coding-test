package leetCode.hard;

import org.junit.jupiter.api.Test;

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
    void givenIntArray_whenFindLongestIncreasingPath_thenCorrect() {
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

    // 좌표에서의 상,하,좌,우 탐색을 위한 배열.
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    //DFS로 접근
    public static int longestIncreasingPath(int[][] matrix) {
        int maxLength = 0;
        int[][] visited = new int[matrix.length][matrix[0].length];

        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[i].length;j++){
                int currLength = helper(i, j, matrix, visited);
                maxLength = Math.max(maxLength, currLength);
            }
        }

        return maxLength;
    }

    /*
    public static void DFS(int m,int n, int[][] matrix, int[] max, int len){
        max[0] = Math.max(max[0], len);

        //한 좌표에서 상,하,좌,우 탐색.
        for(int i =0;i<4;i++){
            int x = m + dx[i]; //탐색할 x좌표
            int y = n + dy[i]; //탐색할 y좌표

            // matrix 배열의 범위를 벗어나면 continue.
            if(x<0 || x>=matrix.length || y<0 || y>=matrix[0].length)
                continue;

            // 현 좌표의 값 < 상,하,좌,우 좌표의 값
            if(matrix[m][n] < matrix[x][y])
                DFS(x,y,matrix, max, len + 1);
        }
    }
     */

    private static int helper(int m, int n, int[][] matrix, int[][] visited) {
        if (visited[m][n] > 0) {
            return visited[m][n];
        }

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int k = 0; k < 4; k++) {
            int x = m + dx[k];
            int y = n + dy[k];

            if (x >= 0 && y >= 0
                    && x < matrix.length
                    && y < matrix[0].length
                    && matrix[x][y] > matrix[m][n]) {
                visited[m][n] = Math.max(visited[m][n], helper(x, y, matrix, visited));
            }
        }

        return ++visited[m][n];
    }
}


