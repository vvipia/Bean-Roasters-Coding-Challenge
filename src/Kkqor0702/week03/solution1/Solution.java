package Kkqor0702.week03.solution1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[][] lines) {
        Map<Integer, Integer> m = new HashMap<>();
        int answer = 0;

        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                m.put(i, m.getOrDefault(i, 0) + 1);
            }
        }

        for (Integer value : m.values()) {
            if (value > 1) {
                answer++;
            }
        }
        return answer;
    }
}