package Jinni1.week1.p70129;

import java.util.*;

class P70129 {
    public int[] solution(String s) {

        int n = 1;
        int next = init(s)[0];
        int count = init(s)[1];
        System.out.println("after init");
        System.out.println("next = " + next + " count = " + count);

        while(next > 1) {
            System.out.println(n +"번 in");
            System.out.println("next = " + next);
            int[] tmp = convert(next);
            next = tmp[0];
            count += tmp[1];
            n++;
            System.out.println("next = " + next + " count = " + count);
        }

        return new int[] {n, count};
    }

    public int[] init(String s) {
        String[] list = s.split("");
        long count = Arrays.stream(list)
            .filter(i -> i.equals("1"))
            .count();

        return new int[] { (int)count, list.length - (int)count};
    }

    public int[] convert(int next) {
        int remain = 0;
        int length = 0;

        while(next >= 1) {
            if (next % 2 == 1) {
                remain++;   // 나머지가 남으면 1이 생김
            } 
            length++;
            next /= 2;
            System.out.println("length = "+length+" remain = "+remain);
        }

        return new int[] {remain, length - remain};
    }
}