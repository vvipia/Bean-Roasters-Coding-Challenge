package Kongsni.week2.sol1;


import java.util.*;

class LargestNumber {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        // 정수를 문자열로 변환
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        // 두 숫자를 이어 붙였을 때 더 큰 순서로 정렬
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // 모든 숫자가 0인 경우
        if (arr[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자열 합치기
        StringBuilder sb = new StringBuilder();

        for (String num : arr) {
            sb.append(num);
        }

        return sb.toString();
    }
}

