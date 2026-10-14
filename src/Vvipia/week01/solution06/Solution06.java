package Vvipia.week01.solution06;

import java.util.*;

//완주하지 못한 선수
class Solution06 {
    // 첫 번쨰 풀이 (오답)
    public int solution1(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        int answer = 0;

        for (String[] s : clothes) {
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
            set.add(s[1]);
            answer++;
        }

        int temp = 1;

        for (String s : set) {
            temp *= map.get(s);
        }

        return answer + temp;
    }

    // 두 번째 풀이
    public int solution2(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();


        for (String[] s : clothes) {
            map.put(s[1], map.getOrDefault(s[1], 0) + 1);
        }

        int temp = 1;

        for (int i : map.values()) {
            temp *= i + 1;
        }

        return temp - 1;
    }
}
