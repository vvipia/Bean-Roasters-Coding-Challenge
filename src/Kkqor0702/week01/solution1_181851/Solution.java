package Kkqor0702.week01.solution1_181851;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public static int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int count = 0;
        for (boolean b : attendance) {
            if (b) {
                count++;
            }
        }

        int[] st = new int[count];
        int index = 0;
        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                st[index++] = rank[i];
            }
        }

        Arrays.sort(st);

        for (int i = 0; i < rank.length; i++) {
            if (st[0] == rank[i]) {
                answer += 10000 * i;
            }
        }

        for (int i = 0; i < rank.length; i++) {
            if (st[1] == rank[i]) {
                answer += 100 * i;
            }
        }

        for (int i = 0; i < rank.length; i++) {
            if (st[2] == rank[i]) {
                answer += i;
            }
        }

        return answer;
    }

    static void main() {
        int[] rank = {3, 7, 2, 5, 4, 6, 1};
        boolean[] attendance = {false, true, true, true, true, false, false};
        System.out.println(solution(rank, attendance));
        System.out.println(solution2(rank, attendance));
    }

    // AI 보고 우선순위 큐
    public static int solution2(int[] rank, boolean[] attendance) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(rank[a], rank[b])
        );
        /* 이 방식도 가능
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                Comparator.comparingInt(a -> rank[a])
        );
         */
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i]) {
                pq.offer(i);
            }
        }

        return pq.poll() * 10000 + pq.poll() * 100 + pq.poll();
    }
}