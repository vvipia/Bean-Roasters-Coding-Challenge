package Kkqor0702.week01.solution5;

class Solution {
    public static int solution(int[][] dots) {
        int x1 = dots[0][0];
        int y1 = dots[0][1];
        int x2 = 0, y2 = 0;

        for (int[] dot : dots) {
            if (x1 != dot[0]) {
                x2 = dot[0];
            }
            if (y1 != dot[1]) {
                y2 = dot[1];
            }
        }
        int len = Math.max(x1, x2) - Math.min(x1, x2);
        int height = Math.max(y1, y2) - Math.min(y1, y2);

        return len * height;
    }
}