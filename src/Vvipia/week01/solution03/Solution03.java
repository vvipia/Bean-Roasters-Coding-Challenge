package Vvipia.week01.solution03;
import java.util.*;

class Solution03 {
    public int solution(int[] queue1, int[] queue2) {
        long target = 0;
        long sum11 = 0;
        long sum22 = 0;
        int maxCount = (queue1.length + queue2.length) * 2;
        Queue<Integer> queue11 = new ArrayDeque<>();
        Queue<Integer> queue22 = new ArrayDeque<>();

        for (int n : queue1) {
            target += n;
            sum11 += n;
            queue11.offer(n);

        }
        for (int n : queue2) {
            target += n;
            sum22 += n;
            queue22.offer(n);
        }

        if (target % 2 != 0) {
            return -1;
        }
        else {
            target /= 2;
        }

        long sum = 0L;
        int count = 0;

        while (sum != target) {
            if (sum11 > sum22) {
                sum11 -= queue11.peek();
                sum22 += queue11.peek();
                queue22.offer(queue11.poll());
            }
            else if (sum11 < sum22) {
                sum11 += queue22.peek();
                sum22 -= queue22.peek();
                queue11.offer(queue22.poll());
            }
            else {
                break;
            }

            if (count > maxCount) {
                return -1;
            }
            count++;
            sum = sum11;
        }
        return count;
    }
}