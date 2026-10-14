package Kkqor0702.week01.solution9;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public static int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] average = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            average[i] = score[i][0] + score[i][1];
        }

        Integer[] sortAverage = Arrays.stream(average)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .toArray(Integer[]::new);

        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            index = 0;
            while (true) {
                if (average[i] == sortAverage[index++]) {
                    break;
                }
            }
            answer[i] = index;
        }
        return answer;
    }

    public static int[] solution2(int[][] score) {
        int n = score.length;
        int[] answer = new int[n];
        int[] average = new int[n];

        for (int i = 0; i < n; i++) {
            average[i] = score[i][0] + score[i][1];
        }

        int[] sorted = average.clone();
        Arrays.sort(sorted); // 오름차순으로 정렬된 배열

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n;

            // 현재 점수보다 큰 원소의 개수를 구한다.
            while (left < right) {
                int mid = (left + right) / 2;

                if (sorted[mid] <= average[i]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            answer[i] = n - left + 1;
        }

        return answer;
    }

    static void main() {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        System.out.println(Arrays.toString(solution(score)));
    }
}