package Kkqor0702.week03.solution2;

class Solution {
    public int solution(int[][] dots) {
        double[] incline = new double[6];


        incline[0] = (double) (dots[0][0] - dots[1][0]) / (dots[0][1] - dots[1][1]);
        incline[1] = (double) (dots[0][0] - dots[2][0]) / (dots[0][1] - dots[2][1]);
        incline[2] = (double) (dots[0][0] - dots[3][0]) / (dots[0][1] - dots[3][1]);
        incline[3] = (double) (dots[1][0] - dots[2][0]) / (dots[1][1] - dots[2][1]);
        incline[4] = (double) (dots[1][0] - dots[3][0]) / (dots[1][1] - dots[3][1]);
        incline[5] = (double) (dots[2][0] - dots[3][0]) / (dots[2][1] - dots[3][1]);

        if (incline[0] == incline[5]) {
            return 1;
        } else if (incline[1] == incline[4]) {
            return 1;
        } else if (incline[2] == incline[3]) {
            return 1;
        }

        return 0;
    }
}