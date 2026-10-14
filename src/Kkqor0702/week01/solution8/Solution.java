package Kkqor0702.week01.solution8;

class Solution {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            do {
                answer++;
            } while (answer % 3 == 0 || Integer.toString(answer).contains("3"));
        }
        return answer;
    }

    static void main() {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }
}