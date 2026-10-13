package Kkqor0702.week01.solution7;

class Solution {
    public static int solution(int chicken) {
        int answer = 0;
        int coupon = chicken; // 1081
        int temp;

        while (coupon / 10 != 0) { // 108개
            temp = coupon / 10;
            answer += temp; // 108
            coupon = coupon - temp * 10 + temp;
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }
}