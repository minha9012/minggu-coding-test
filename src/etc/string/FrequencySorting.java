package etc.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.lang3.RandomStringUtils;

public class FrequencySorting {
    /**
     * <문제 비공개>
     *
     * ▣ 매개변수 형식 1
     * “aaAAcccbbbBB”
     * ▣ 반환값 형식 1
     * “cccbbbAABBaa”
     * ▣ 매개변수 형식 2
     * “kdkDKKGkdkgks”
     * ▣ 반환값 형식 2
     * “kkkkkKKddDGgs”
     */

    private static final String input1 = "aaAAcccbbbBB"; //expect "cccbbbAABBaa"
    private static final String input2 = "kdkDKKGkdkgks"; //expect "kkkkkKKddDGgs"

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(solution(RandomStringUtils.randomAlphabetic(10)));
        }
//        System.out.println(solution(input1));
//        System.out.println(solution(input2));
    }

    public static String solution(String input) {
        HashMap<Character, Integer> hm = new HashMap();

        // 1. hashMap에  담기
        for (int i = 0; i < input.length(); i++)
            hm.put(input.charAt(i), hm.getOrDefault(input.charAt(i), 0) + 1); //key값 먼저 담기

        // 2. 빈도순 기준으로 내림차순 알파벳 정렬
        List<Entry<Character, Integer>> entryList = new ArrayList<>(hm.entrySet());
        entryList.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        // 3. value 만큼 key 반복해 String 으로
        StringBuilder answer = new StringBuilder();
        for (Entry<Character, Integer> characterIntegerEntry : entryList)
            answer.append(String.valueOf(characterIntegerEntry.getKey()).repeat(Math.max(0, characterIntegerEntry.getValue())));

//        String answer = entryList.stream().map(Entry::getKey).collect(Collectors.toList()) //entry keySet to Char List
//                .stream().map(String::valueOf).collect(Collectors.joining()); // Char List to String
        return answer.toString();
    }
}
