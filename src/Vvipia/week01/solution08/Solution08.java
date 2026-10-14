package Vvipia.week01.solution08;
//제일 작은 수 제거하기
public class Solution08 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[] {-1};
        }
        int temp = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (temp > arr[i]) {
                index = i;
                temp = arr[i];
            }
        }

        int[] answer = new int[arr.length - 1];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            else {
                answer[count++] = arr[i];
            }
        }
        return answer;
    }
}
