package Vvipia.week01.solution05;

import java.util.*;

//완주하지 못한 선수
class Solution05 {

    // 처음 풀이
    public String solution1(String[] participant, String[] completion) {
        List<String> list = new ArrayList<>();

        for(String s : participant) {
            list.add(s);
        }

        for(String s : completion) {
            list.remove(s);
        }

        return list.get(0);
    }

    // 두 번째 풀이
    public String solution2(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> map = new HashMap<>();

        for (String s : participant) {
            map.put(s, 1 + map.getOrDefault(s, 0));
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }
        for (String s : participant) {
            if (map.get(s) > 0) {
                answer = s;
            }
        }
        return answer;
    }
}
