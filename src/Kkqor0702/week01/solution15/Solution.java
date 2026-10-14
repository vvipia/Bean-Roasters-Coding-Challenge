package Kkqor0702.week01.solution15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int solution(int[] array) {
        int answer = 0;
        int[] arr = new int[1000];
        for (int i : array) {
            arr[i]++;
        }
        int count = 0;
        int index = 0;
        int max = Arrays.stream(arr).max().orElse(-1);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                count++;
                index = i;
            }
        }
        if (count == 1) {
            return index;
        } else {
            return -1;
        }
    }

    public int solution2(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = 0;
        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > max) {
                max = count;
                answer = num;
            } else if (count == max) {
                answer = -1;
            }
        }
        return answer;
    }

    static void main() {
        int[] arr1 = {1, 2, 3, 3, 3, 4, 4};
        int[] arr2 = {1, 1, 2, 2};
        int[] arr3 = {1};

        System.out.println(solution(arr1));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }
}