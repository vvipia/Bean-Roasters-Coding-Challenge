package Kkqor0702.week02.solution2;

class Solution {
    public int solution(int[] common) {
        int num;
        boolean isMul;
        if (common[1] - common[0] == common[2] - common[1]) {
            num = common[1] - common[0];
            isMul = false;
        } else {
            num = common[1] / common[0];
            isMul = true;
        }
        return isMul ? common[common.length - 1] * num : common[common.length - 1] + num;
    }
}