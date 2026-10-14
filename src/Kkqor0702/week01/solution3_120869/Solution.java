package Kkqor0702.week01.solution3_120869;

class Solution {
    public static int solution(String[] spell, String[] dic) {
        int len = spell.length;
        int count = 0;

        for (String word : dic) {
            count = 0;
            for (String letter : spell) {
                int i = word.indexOf(letter);
                if (i == -1) { // 없는 것.
                    break;
                } else {
                    count++;
                }
            }
            if (count == len) {
                return 1;
            }
        }
        return 2;
    }

    static void main() {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
        System.out.println(solution(spell, dic));
    }

}