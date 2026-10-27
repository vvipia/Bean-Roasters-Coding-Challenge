package Vvipia.week03.solution01_common;

import java.util.Arrays;

class Solution01 {
    public String solution(int[] numbers) {
        String[] strArr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strArr, (a, b) -> (b + a).compareTo(a + b));
        if (strArr[0].equals("0")) {
            return "0";
        }
        String result = String.join("", strArr);

        return result;
    }
}
