package Kkqor0702.week03.solution3;

class Solution {
    public int[] solution(int[] answers) {
        int len = answers.length;

        int[] st1 = {1, 2, 3, 4, 5};
        int score1 = 0;
        // [1 2 3 4 5] 1 2 3 4 5

        int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int score2 = 0;
        // [2 1 2 3 2 4 2] 5 2 1 2 3 2 4 2 5

        int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score3 = 0;
        // [3 3 1 1 2 2 4 4 5 5] 3 3 1 1 2 2 4 4 5 5

        for (int i = 0; i < len; i++) {
            if (answers[i] == st1[i % st1.length]) {
                score1++;
            }

            if (answers[i] == st2[i % st2.length]) {
                score2++;
            }

            if (answers[i] == st3[i % st3.length]) {
                score3++;
            }
        }

        int max = Math.max(score1, Math.max(score2, score3));
        int ansLen = 0;
        if (max == score1) {
            ansLen++;
        }
        if (max == score2) {
            ansLen++;
        }
        if (max == score3) {
            ansLen++;
        }
        int[] answer = new int[ansLen];
        int index = 0;
        if (max == score1) {
            answer[index++] = 1;
        }
        if (max == score2) {
            answer[index++] = 2;
        }
        if (max == score3) {
            answer[index++] = 3;
        }
        return answer;
    }
}