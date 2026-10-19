package Vvipia.week02.solution01_common;
// 문제: K번째수
import java.util.Arrays;
class Solution01 {
    public int[] solution(int[] array, int[][] commands) {
        return Arrays.stream(commands)
                .mapToInt(command -> {
                    int[] sorted = Arrays.stream(
                            array,
                            command[0] - 1,
                            command[1]
                    ).sorted().toArray();

                    return sorted[command[2] - 1];
                })
                .toArray();
    }
}