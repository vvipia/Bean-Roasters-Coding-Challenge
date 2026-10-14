package Kkqor0702.week01.solution11;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static List<Integer> solution(int l, int r) {
        List<Integer> answerList = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            boolean b = true;
            String num = Integer.toString(i);
            char[] charArray = num.toCharArray();
            for (char c : charArray) {
                if (!(c == '5' || c == '0')) {
                    b = false;
                }
            }
            if (b) {
                answerList.add(i);
            }
        }
        if (answerList.size() == 0) {
            answerList.add(-1);
        }
        return answerList;
    }

    static void main() {
        System.out.println(solution(5, 555));
    }
}