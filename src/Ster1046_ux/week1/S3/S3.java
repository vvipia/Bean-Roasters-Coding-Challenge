package Ster1046_ux.week1.S3;

public class S3 {
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

// ai의 방식
//public int solution(int[] sides) {
//    int longSide = sides[0];
//
//    for (int i = 1; i < sides.length; i++) {
//        if (sides[i] > longSide) {
//            longSide = sides[i];
//        }
//    }
//
//    int otherSides = sides[0] + sides[1] + sides[2] - longSide;
//
//    if (otherSides > longSide) {
//        return 1;
//    } else {
//        return 2;
//    }
//}