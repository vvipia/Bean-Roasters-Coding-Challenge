package Kkqor0702.week01.solution13;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] arr, int[] query) {
        int[] answer = arr;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                answer = Arrays.copyOf(answer, query[i] + 1);
            } else {
                answer = Arrays.copyOfRange(answer, query[i], answer.length);
            }
        }
        return answer;
    }

    static void main() {
        int[] arr = {0, 1, 2, 3, 4, 5};
        int[] query = {4, 1, 2};
        System.out.println(Arrays.toString(solution(arr, query)));

    }
}