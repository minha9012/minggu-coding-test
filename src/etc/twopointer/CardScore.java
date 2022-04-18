package etc.twopointer;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CardScore {
    /**
     * <문제 비공개>
     * ▣ 매개변수 형식 1
     * [3, 2, 5, 6, 7, 1], 3
     * ▣ 반환값 형식 1
     * 14
     * ▣ 매개변수 형식 2
     * [3, 1, 4, 5, 4, 1, 2, 5], 5
     * ▣ 반환값 형식 2
     * 18
     */

    private static final int[] inputArr = {3, 2, 5, 6, 7, 1};
    private static final int inputK = 3;
    private static final int[] inputArr2 = {3, 1, 4, 5, 4, 1, 2, 5}; //expect 18
    private static final int inputK2 = 5;

    public static void main(String[] args) {
        System.out.println(solution(inputArr, inputK)); //expect 14
        System.out.println(solution(inputArr2, inputK2)); //expect 18
    }

    private static int solution(int[] inputArr, int k) {
        int answer = 0;
        int left = 0;
        int right = 0;
        int sum = 0;

        for (int start=0; start < k; start++){

            while(start <= k) {
                left = inputArr[start];
                right = inputArr[inputArr.length - 1];
            }

            sum = left + right;

            if(answer < sum) answer = sum;
        }


        System.out.println(sum);


        /*
        int sum = 0;
        int end = 0; // start를 차례대로 증가시키며 반복

        for (int start = 0; start < k; start++) { // end를 가능한 만큼 이동시키기
            while ( end < k) {
                sum += inputArr[end];
                end++;
            }
            sum -= inputArr[start];
        }
        System.out.println(sum);
        */

        System.out.println("finished!");
        return answer;
    }

}
