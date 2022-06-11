package leetCode.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/course-schedule/
 *
 * LeetCode - Top 100 - Medium - 207. Course Schedule
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
    void givenIntAndIntArray_whenTakeCourses_thenCorrect() {
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

    //DAG(Directed Acyclic Graph)에 적용가능한 위상정렬(Topological Sort)로 접근
    public static boolean canFinish(int numCourses, int[][] prerequisites){
        int[] inDegree = new int[numCourses]; //진입차수
        List<List<Integer>> adjacencyList = new ArrayList<>(); //인접노드 리스트
        Queue<Integer> result = new LinkedList<>();
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<numCourses;i++)
            adjacencyList.add(new ArrayList<>()); //ArrayList 초기화

        for (int[] prerequisite : prerequisites) {
            int start = prerequisite[1]; //선수과목
            int end = prerequisite[0]; //후수과목

            adjacencyList.get(start).add(end); //인접노드 리스트에 추가
            inDegree[end]++; //진입차수 증가
        }

        for(int i=0;i<numCourses;i++)
            if(inDegree[i] == 0) queue.offer(i); //진입차수가 0인 노드만 Queue에 삽입(시작점)

        while(!queue.isEmpty()){
            int currNode = queue.poll(); //현재노드 출력 후 삭제
            result.offer(currNode); //현재노드 결과큐에 저장

            for(int child : adjacencyList.get(currNode)){
                inDegree[child]--; //연결된 간선 제거 후 진입차수 갱신
                if(inDegree[child] == 0) queue.offer(child); //전부 제거되어 진입차수가 0이 되면 Queue에 삽입
            }
        }

        //결과큐 사이즈가 수업갯수와 동일해지는 위상정렬 결과를 return
        return result.size() == numCourses; //모든 원소 방문 전 큐가 비었다면 Cycle이 존재하므로 false
    }


}


