package Vvipia.week01.solution04_common;

import java.util.*;

class Solution04 {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n : nums) {
            set.add(n);
        }

        int count = 0;

        for (int n : set) {
            count++;
        }

        if (nums.length / 2 > count) {
            return count;
        }
        else {
            return nums.length / 2;
        }
    }
}