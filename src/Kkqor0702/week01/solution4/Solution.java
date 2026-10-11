package Kkqor0702.week01.solution4;

class Solution {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        for (String[] idPw : db) {
            if (id_pw[0].equals(idPw[0])) {
                if (id_pw[1].equals(idPw[1])) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }
        return "fail";
    }

    static void main() {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        System.out.println(solution(id_pw, db));


    }
}