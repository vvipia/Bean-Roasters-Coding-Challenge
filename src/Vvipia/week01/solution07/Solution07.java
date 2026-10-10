package Vvipia.week01.solution07;

import java.util.ArrayList;
import java.util.List;

public class Solution07 {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                list.add(arr[i]);
            }
            else if (arr[i-1] != arr[i]) {
                list.add(arr[i]);
            }
            else {
                continue;
            }
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
