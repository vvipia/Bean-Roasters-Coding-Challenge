package Kkqor0702.week02.solution4;

class Solution {
    public int solution(int[][] board) {
        int len = board.length;
        int[][] notSafe = new int[len + 2][len + 2];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] != 0) {
                    notSafe[i][j]++;
                    notSafe[i][j + 1]++;
                    notSafe[i][j + 2]++;
                    notSafe[i + 1][j]++;
                    notSafe[i + 1][j + 1]++;
                    notSafe[i + 1][j + 2]++;
                    notSafe[i + 2][j]++;
                    notSafe[i + 2][j + 1]++;
                    notSafe[i + 2][j + 2]++;
                }
            }
        }
        int safe = len * len;
        for (int i = 1; i < len + 1; i++) {
            for (int j = 1; j < len + 1; j++) {
                if (notSafe[i][j] != 0) {
                    safe--;
                }
            }
        }
        return safe;
    }

    static void main() {

    }
}