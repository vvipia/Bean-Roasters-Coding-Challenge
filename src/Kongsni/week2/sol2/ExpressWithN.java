package Kongsni.week2.sol2;


import java.util.*;

class ExpressWithN {
    public int solution(int N, int number) {
        List<Set<Integer>> dp = new ArrayList<>();
        dp.add(new HashSet<>());

        // N을 1번부터 8번까지 사용
        for (int i = 1; i <= 8; i++) {
            Set<Integer> current = new HashSet<>();

            // N, NN, NNN ... 생성
            int repeated = 0;

            for (int j = 0; j < i; j++) {
                repeated = repeated * 10 + N;
            }

            current.add(repeated);

            // 이전 DP 결과들을 조합
            for (int j = 1; j < i; j++) {
                Set<Integer> left = dp.get(j);
                Set<Integer> right = dp.get(i - j);

                for (int a : left) {
                    for (int b : right) {
                        current.add(a + b);
                        current.add(a - b);
                        current.add(a * b);

                        // 0으로 나누는 경우 방지
                        if (b != 0) {
                            current.add(a / b);
                        }
                    }
                }
            }

            // 목표 숫자를 만들었다면 최소 사용 횟수 반환
            if (current.contains(number)) {
                return i;
            }

            dp.add(current);
        }

        return -1;
    }
}
