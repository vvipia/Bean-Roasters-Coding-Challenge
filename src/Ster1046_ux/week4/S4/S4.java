package Ster1046_ux.week4.S4;

public class S4 {
    public int[] solution(int[] answers) {
        int[] answer = {};


        int[] pattern1 = {1, 2, 3, 4, 5};
        int score1 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (pattern1[i % pattern1.length] == answers[i]) {
                score1++;
            }
        }

        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int score2 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (pattern2[i % pattern2.length] == answers[i]) {
                score2++;
            }
        }

        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (pattern3[i % pattern3.length] == answers[i]) {
                score3++;
            }
        }

        int maxScore = Math.max(Math.max(score1, score2), score3);

        int count = 0;

        if(score1 == maxScore) {
            count++;
        }
        if(score2 == maxScore) {
            count++;
        }
        if(score3 == maxScore) {
            count++;
        }

        answer = new int[count];

        int index = 0;

        if (score1 == maxScore) {
            answer[index] = 1;
            index++;
        }
        if (score2 == maxScore) {
            answer[index] = 2;
            index++;
        }
        if (score3 == maxScore) {
            answer[index] = 3;
            index++;
        }

        return answer;
    }
}