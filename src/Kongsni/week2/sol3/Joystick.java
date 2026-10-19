package Kongsni.week2.sol3;

class Joystick {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();

        // 기본 좌우 이동 횟수
        int minMove = length - 1;

        for (int i = 0; i < length; i++) {

            // 1. 상하 이동 횟수 계산
            char c = name.charAt(i);

            int up = c - 'A';
            int down = 'Z' - c + 1;

            answer += Math.min(up, down);

            // 2. 연속된 A 구간 찾기
            int next = i + 1;

            while (next < length &&
                    name.charAt(next) == 'A') {
                next++;
            }

            // 3. 오른쪽으로 갔다가 왼쪽으로 돌아가기
            int rightThenLeft = i * 2 + length - next;

            // 4. 왼쪽으로 갔다가 오른쪽으로 돌아가기
            int leftThenRight = i + (length - next) * 2;

            // 5. 최소 좌우 이동 횟수 갱신
            minMove = Math.min(minMove,
                    Math.min(rightThenLeft, leftThenRight));
        }

        return answer + minMove;
    }
}

