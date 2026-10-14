package Kkqor0702.week01.solution6;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static int solution(int[] nums) {
        Set<Integer> pokemon = new HashSet<>();
        for (int num : nums) {
            pokemon.add(num);
        }
        int a = nums.length / 2;
        int b = pokemon.size();
        return Math.min(a, b);
    }

    static void main() {
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution(nums));
    }
}
