package Kkqor0702.week01.solution12;

class Solution {
    public static int solution(int a, int b) {
        int i = 2;
        while (a >= i) {
            if (a % i == 0) {
                a /= i;
                if (b % i == 0) {
                    b /= i;
                }
                i = 2;
            } else {
                i++;
            }
        }
        i = 2;
        while (b >= i) {
            if (b % i == 0) {
                if (i % 2 == 0 || i % 5 == 0) {
                    b /= i;
                    i = 2;
                } else {
                    return 2;
                }
            } else {
                i++;
            }
        }
        return 1;
    }

    static void main() {
        System.out.println(solution(7, 20));
        System.out.println(solution(11, 22));
        System.out.println(solution(12, 21));
    }
}