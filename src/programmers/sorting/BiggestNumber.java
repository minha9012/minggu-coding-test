package programmers.sorting;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746
 *
 * 프로그래머스 - 정렬 - Level 2 가장 큰 수
 *
 * 문제 설명
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 *
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 * 입출력 예
 * numbers	return
 * [6, 10, 2]	"6210"
 * [3, 30, 34, 5, 9]	"9534330"
 */

public class BiggestNumber {
    private static final int[] inputArr = {6, 10, 2};
    private static final int[] inputArr2 = {3, 30, 34, 5, 9};

    public static void main(String[] args) {
        System.out.println(solution(inputArr)); //expect 6210
        System.out.println(solution(inputArr2)); //expect 9534330
    }

    public static String solution(int[] numbers) {
        String[] strNumbersArr = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++)
            strNumbersArr[i] = String.valueOf(numbers[i]);

        // return solution1(strNumbersArr);
        String answer = Stream.of(strNumbersArr).sorted(
                (o1,o2)->(o2+o1).compareTo(o1+o2)).collect(Collectors.joining());
        return answer.charAt(0) == '0' ? "0" : answer;
    }

    public String solution1(String[] strNumbersArr){
        //두 수를 번갈아가며 합친 수 중 큰 값을 앞으로 정렬(내림차순 정렬)
        Arrays.sort(strNumbersArr, new myComparator());

        if(strNumbersArr[0].equals("0")) return "0";
        //문자열을 delimiter("") 기준으로 합침
        return String.join("", strNumbersArr);
    }

    public static class myComparator implements Comparator<String>{
        @Override
        public int compare(String o1, String o2){
            return (o2+o1).compareTo(o1+o2);
        }
    }

}
