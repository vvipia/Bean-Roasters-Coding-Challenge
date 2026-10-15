package Kkqor0702.week02.solution7;

import java.util.Arrays;

class Solution {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int index = 0;
        for (int[] command : commands) {
            int[] clone = array.clone();
            Arrays.sort(clone, command[0] - 1, command[1]);
            answer[index++] = clone[command[2] + command[0] - 2];
        }
        return answer;
    }

    static void main() {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        System.out.println(Arrays.toString(array));
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }
}