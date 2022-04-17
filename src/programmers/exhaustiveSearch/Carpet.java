package programmers.exhaustiveSearch;

import java.util.HashSet;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42842
 *
 * 프로그래머스 - 완전 탐색 - Level 2 - 카펫
 *
 * 문제 설명
 * Leo는 카펫을 사러 갔다가 아래 그림과 같이 중앙에는 노란색으로 칠해져 있고 테두리 1줄은 갈색으로 칠해져 있는 격자 모양 카펫을 봤습니다.
 *
 *
 * Leo는 집으로 돌아와서 아까 본 카펫의 노란색과 갈색으로 색칠된 격자의 개수는 기억했지만, 전체 카펫의 크기는 기억하지 못했습니다.
 *
 * Leo가 본 카펫에서 갈색 격자의 수 brown, 노란색 격자의 수 yellow가 매개변수로 주어질 때 카펫의 가로, 세로 크기를 순서대로 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 갈색 격자의 수 brown은 8 이상 5,000 이하인 자연수입니다.
 * 노란색 격자의 수 yellow는 1 이상 2,000,000 이하인 자연수입니다.
 * 카펫의 가로 길이는 세로 길이와 같거나, 세로 길이보다 깁니다.
 * 입출력 예
 * brown	yellow	return
 * 10	2	[4, 3]
 * 8	1	[3, 3]
 * 24	24	[8, 6]
 */

public class Carpet {

    private static final int inputBrown1 = 10; //expect [4,3]
    private static final int inputYellow1 = 2;
    private static final int inputBrown2 = 8; //expect [3,3]
    private static final int inputYellow2 = 1;
    private static final int inputBrown3 = 24; //expect [8,6]
    private static final int inputYellow3 = 24;

    public static void main(String[] args) {
        System.out.println(solution(inputBrown1, inputYellow1));
        System.out.println(solution(inputBrown2, inputYellow2));
        System.out.println(solution(inputBrown3, inputYellow3));
    }


    public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpets = brown / 2;

        for(int hieght = carpets - 1; hieght >= carpets / 2 ; hieght--){
            int width = carpets - hieght;
            if((width-1) * (hieght-1) == yellow){
                answer[0] = hieght + 1;
                answer[1] = width + 1;
                return answer;
            }
        }

        return answer;
    }
}
