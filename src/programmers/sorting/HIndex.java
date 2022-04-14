package programmers.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42747
 *
 * 프로그래머스 - 정렬 - Level 2 - H-Index
 * 문제 설명
 * H-Index는 과학자의 생산성과 영향력을 나타내는 지표입니다. 어느 과학자의 H-Index를 나타내는 값인 h를 구하려고 합니다. 위키백과1에 따르면, H-Index는 다음과 같이 구합니다.
 *
 * 어떤 과학자가 발표한 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index입니다.
 *
 * 어떤 과학자가 발표한 논문의 인용 횟수를 담은 배열 citations가 매개변수로 주어질 때, 이 과학자의 H-Index를 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 과학자가 발표한 논문의 수는 1편 이상 1,000편 이하입니다.
 * 논문별 인용 횟수는 0회 이상 10,000회 이하입니다.
 * 입출력 예
 * citations	return
 * [3, 0, 6, 1, 5]	3
 * 입출력 예 설명
 * 이 과학자가 발표한 논문의 수는 5편이고, 그중 3편의 논문은 3회 이상 인용되었습니다. 그리고 나머지 2편의 논문은 3회 이하 인용되었기 때문에 이 과학자의 H-Index는 3입니다.
 *
 * ※ 공지 - 2019년 2월 28일 테스트 케이스가 추가되었습니다.
 */

public class HIndex {
    private static final int[] inputArr = {6, 10, 2};
    private static final int[] inputArr2 = {3, 30, 34, 5, 9};

    public static void main(String[] args) {
        System.out.println(solution(inputArr)); //expect 6210
        System.out.println(solution(inputArr2)); //expect 9534330
    }

    public static int solution(int[] citations) {
        int answer = 0;
        float sum = 0f;
        int avg = 0;

        for (int i = 0; i < citations.length; i++)
            sum += citations[i]; //총합구하기

        avg = Math.round(sum / (float) citations.length); //평균

        while(answer < avg){
            for (int i = 0; i < citations.length; i++){
                if(citations[i] >= avg) answer++;
            }

        }
        System.out.println("평균 : " + avg);

        return answer;
    }

    /* 중앙값 출력 함수 */
    private static int getMedian(int[] arrayInt) {
        float result;
        int size = arrayInt.length;
        Arrays.sort(arrayInt); //오름차순 정렬

        if(size % 2 == 0){ //배열크기가 짝수일경우
            int m = size / 2;
            int n = size / 2 - 1;
            result = (float)(arrayInt[m] + arrayInt[n]) / 2; //중앙값 2개의 평균
        } else { //배열크기가 홀수인경우
            int m = size / 2;
            result = arrayInt[m]; //중앙값
        }

        return Math.round(result);
    }

    public static class myComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2){
            return (o2+o1).compareTo(o1+o2);
        }
    }

}
