package Kkqor0702.week01.solution10;

class Solution {
    public static int solution(String A, String B) {
        char[] charArray = A.toCharArray();
        int len = charArray.length;
        for (int i = 0; i < len; i++) {
            String b = "";
            for (int j = 0; j < len; j++) {
                b += charArray[(len + j - i) % len];
            }
            if (b.equals(B)) {
                return i;
            }
        }
        return -1;
    }

    static void main() {
        String A = "hello";
        String B = "ohell";
        System.out.println(solution(A, B));

    }
}