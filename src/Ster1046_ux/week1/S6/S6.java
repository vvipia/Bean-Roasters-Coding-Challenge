package Ster1046_ux.week1.S6;

import java.util.HashSet;

public class S6 {
    public int solution(int[] nums) {
        int answer = 0;

        HashSet<Integer> kinds = new HashSet<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            kinds.add(num);
        }

        int kindCount = kinds.size();
        int pickCount = nums.length / 2;

        if(kindCount >= pickCount) {
            answer = pickCount;
        } else {
            answer = kindCount;
        }


        return answer;
    }
}
