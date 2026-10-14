package Jinni1.week1.p1845;

import java.util.*;

public class P1845 {
    public int solution(int[] nums) {
        int n = nums.length/2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }
        }
        
        return map.size() > n ? n : map.size();
    }
}
