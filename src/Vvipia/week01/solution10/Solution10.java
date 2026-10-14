package Vvipia.week01.solution10;
//올바른 괄호
public class Solution10 {
    boolean solution(String s) {

        if (s.charAt(0) == ')') {
            return false;
        }
        if (s.charAt(s.length()-1) == '(') {
            return false;
        }

        int temp = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                temp++;
            }
            else {
                temp--;
            }
            if (temp < 0) return false;
        }

        if (temp == 0) return true;
        else return false;
    }
}