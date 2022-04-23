package programmers.graph;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/49189
 * <p>
 * 프로그래머스 - 그래프 - Level 3 - 가장 먼 노드
 * <p>
 * 문제 설명
 * n개의 노드가 있는 그래프가 있습니다. 각 노드는 1부터 n까지 번호가 적혀있습니다. 1번 노드에서 가장 멀리 떨어진 노드의 갯수를 구하려고 합니다. 가장 멀리 떨어진 노드란 최단경로로 이동했을 때 간선의 개수가 가장 많은 노드들을 의미합니다.
 * <p>
 * 노드의 개수 n, 간선에 대한 정보가 담긴 2차원 배열 vertex가 매개변수로 주어질 때, 1번 노드로부터 가장 멀리 떨어진 노드가 몇 개인지를 return 하도록 solution 함수를 작성해주세요.
 * <p>
 * 제한사항
 * 노드의 개수 n은 2 이상 20,000 이하입니다.
 * 간선은 양방향이며 총 1개 이상 50,000개 이하의 간선이 있습니다.
 * vertex 배열 각 행 [a, b]는 a번 노드와 b번 노드 사이에 간선이 있다는 의미입니다.
 * 입출력 예
 * n	vertex	return
 * 6	[[3, 6], [4, 3], [3, 2], [1, 3], [1, 2], [2, 4], [5, 2]]	3
 * 입출력 예 설명
 * 예제의 그래프를 표현하면 아래 그림과 같고, 1번 노드에서 가장 멀리 떨어진 노드는 4,5,6번 노드입니다.
 */


public class FarthestNode {

    static final int inputN = 6;
    static final int[][] inputArr = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}; //expect 3

    public static void main(String[] args) {
        System.out.println(solution(inputN, inputArr));
    }

    static ArrayList<Integer>[] graph; //노드정보 담을 그래프
    static boolean[] visited; //방문체크
    static int[] tempDistance; //최단거리 정보
    static int maxDistance = Integer.MIN_VALUE;

    public static int solution(int n, int[][] edge) {
        graph = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        tempDistance = new int[n + 1];

        for (int i = 1; i <= n; i++)
            graph[i] = new ArrayList<>();

        for (int[] ints : edge) { //그래프 정보 담기
            graph[ints[0]].add(ints[1]);
            graph[ints[1]].add(ints[0]);
        }

        bfs(); //너비우선탐색 시작

        int answer = 0;
        for (int i : tempDistance)
            if (i == maxDistance) answer++;

        return answer;
    }

    static void bfs() {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        visited[1] = true;
        tempDistance[1] = 0;

        while (!q.isEmpty()) {
            int k = q.poll();

            for (Integer x : graph[k]) {
                if (!visited[x]) {
                    q.offer(x);
                    visited[x] = true;
                    tempDistance[x] = tempDistance[k] + 1;
                    maxDistance = Math.max(maxDistance, tempDistance[x]);
                }
            }
        }
    }
}
