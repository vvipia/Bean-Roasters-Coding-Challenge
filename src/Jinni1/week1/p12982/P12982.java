package Jinni1.week1.p12982;

import java.util.*;

class P12982 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int n = 0;
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            
            if(sum + d[i] > budget) {
                break;
            }
            
            sum += d[i];
            n = i+1;
        }
        
        return n;
    }
}

