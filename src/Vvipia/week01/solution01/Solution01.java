package Vvipia.week01.solution01;
// 문제: 자연수 뒤집어 배열로 만들기
class Solution01 {
    public int[] solution(long n) {
        int nScale = 0;
        long temp = n;

        while (temp != 0) {
            temp /= 10;
            nScale++;
        }

        int[] answer = new int[nScale];

        for (int i = 0; i < nScale; i++) {
            answer[i] = (int)(n % 10);
            n /= 10;
        }

        return answer;
    }
}