package Kkqor0702.week02.solution6;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int num = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        answer[0] = num / gcd(num, denom);
        answer[1] = denom / gcd(num, denom);
        return answer;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

}