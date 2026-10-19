package Kkqor0702.week02.solution8;

import java.util.Arrays;

class Solution {
    public static String solution(int[] numbers) {
        String answer = "";
        int[] array1 = Arrays.stream(numbers)
                .boxed()
                .sorted((a, b) -> {
                    String ab = "" + a + b;
                    String ba = "" + b + a;
                    return ba.compareTo(ab);
                })
                .mapToInt(Integer::intValue)
                .toArray();

        if (array1[0] == 0) {
            return "0";
        }

        for (int i = 0; i < array1.length; i++) {
            answer += array1[i];
        }

        return answer;
    }

    static void main(String[] args) {
        int numbers[] = {3, 30, 34, 5, 9};
        Arrays.sort(numbers, (a, b) -> Integer.compare(b, a));

        System.out.println(solution(numbers));
    }

}