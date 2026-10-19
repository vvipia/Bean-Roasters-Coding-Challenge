package Kkqor0702.week02.solution3;

import java.util.Arrays;

class Solution {
    public static int[] solution(int num, int total) {
        int[] answer = new int[num];
        if (num % 2 == 1) {
            int first = total / num - num / 2;
            for (int i = 0; i < num; i++) {
                answer[i] = first++;
            }
        } else {
            int first = total / num - num / 2 + 1;
            for (int i = 0; i < num; i++) {
                answer[i] = first++;
            }
        }
        return answer;
    }

    static void main() {
        System.out.println(Arrays.toString(solution(3, 12)));
        System.out.println(Arrays.toString(solution(5, 15)));
        System.out.println(Arrays.toString(solution(4, 14)));
        System.out.println(Arrays.toString(solution(5, 5)));
    }
}