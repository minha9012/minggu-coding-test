package leetCode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/course-schedule/
 *
 * LeetCode - Top 100 - Medium - 394. Decode String
 *
 * 문제 설명
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.
 *
 * For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 *
 *
 * Example 1:
 * Input: numCourses = 2, prerequisites = [[1,0]]
 * Output: true
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0. So it is possible.
 *
 * Example 2:
 * Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
 * Output: false
 * Explanation: There are a total of 2 courses to take.
 * To take course 1 you should have finished course 0, and to take course 0 you should also have finished course 1. So it is impossible.
 *
 *
 * Constraints:
 * 1 <= numCourses <= 2000
 * 0 <= prerequisites.length <= 5000
 * prerequisites[i].length == 2
 * 0 <= ai, bi < numCourses
 * All the pairs prerequisites[i] are unique.
 */


public class CourseSchedule {

    @Test
    void exampleCase() {
        assertAll(
                () -> test(2,new int[][]{{1,0}},true),
                () -> test(2,new int[][]{{1,0},{0,1}},false)
        );
    }

    private void test(int given1, int[][] given2, boolean expected) {
        // when
        boolean actual = CourseSchedule.canFinish(given1, given2);

        // then
        assertEquals(expected, actual);
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites){
        boolean answer = false;


        return answer;
    }


}


