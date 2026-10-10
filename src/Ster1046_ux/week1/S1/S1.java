package Ster1046_ux.week1.S1;

class S1 {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if('0' <= ch && ch <= '9') {
                answer += ch - '0';
            }
        }
        return answer;
    }
}