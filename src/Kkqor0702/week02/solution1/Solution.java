package Kkqor0702.week02.solution1;

import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        int index = 0;
        for (String q : quiz) {
            String[] exp = q.split(" ");
            int num1 = Integer.parseInt(exp[0]);
            String ex = exp[1];
            int num2 = Integer.parseInt(exp[2]);
            int res = Integer.parseInt(exp[4]);

            if (ex.equals("+")) {
                if (num1 + num2 == res) {
                    answer[index] = "O";
                } else {
                    answer[index] = "X";
                }
            }
            if (ex.equals("-")) {
                if (num1 - num2 == res) {
                    answer[index] = "O";
                } else {
                    answer[index] = "X";
                }
            }
            index++;
        }
        return answer;
    }

    static void main() {
        String ex = "   3 - 4 = -3   ";
        String[] split = ex.split(" +");
        System.out.println(Arrays.toString(split));
    }
}