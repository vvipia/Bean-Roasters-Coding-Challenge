package Ster1046_ux.week4.S2;

public class S2 {
    public int solution(int[] sides) {
        int answer = 0;
        int longSide;

        if(sides[0] >= sides[1]) {
            longSide = sides[0];
        } else {
            longSide = sides[1];
        }
        if (sides[2] > longSide) {
            longSide = sides[2];
        }

        int otherSides = sides[0] + sides[1] + sides[2] - longSide;

        if(otherSides > longSide) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}

//// 완전탐색으로 풀이
//class Solution {
//    public int solution(int[] sides) {
//        int sum = sides[0] + sides[1] + sides[2];
//
//        for (int i = 0; i < sides.length; i++) {
//            int currentSide = sides[i];
//            int otherSides = sum - currentSide;
//
//            if (currentSide >= otherSides) {
//                return 2;
//            }
//        }
//
//        return 1;
//    }
//}