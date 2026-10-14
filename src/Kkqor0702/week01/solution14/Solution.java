package Kkqor0702.week01.solution14;

class Solution {
    public static String solution(String polynomial) {
        String answer = "";
        polynomial = polynomial.replaceAll(" ", "");
        String[] exp = polynomial.split("[+]");

        int resX = 0;
        int resNum = 0;

        for (String s : exp) {
            if (s.endsWith("x")) {
                if (s.length() == 1) {
                    resX += 1;
                } else {
                    resX += Integer.parseInt(s.substring(0, s.length() - 1));
                }
            } else {
                resNum += Integer.parseInt(s);
            }
        }

        if (resX == 1) {
            answer = "x";
            if (resNum != 0) {
                answer = answer + " + " + resNum;
            }
        } else if (resX != 0) {
            answer = resX + "x";
            if (resNum != 0) {
                answer = answer + " + " + resNum;
            }
        } else {
            if (resNum != 0) {
                answer = "" + resNum;
            }
        }

        return answer;
    }

    static void main() {
        String polynomial = "3x + 7 + x";
        System.out.println(solution(polynomial));
        System.out.println(solution("x"));
    }
}