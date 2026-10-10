package Ster1046_ux.week1.S2;

class S2 {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];

        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].length();
        }
        return answer;
    }
    /*
     * 비슷한 연습문제: 배열 원소의 첫 글자
     *
     * 문자열 배열 strlist의 각 문자열에서 첫 글자를 꺼내
     * 입력 순서대로 char[] 배열에 담아 반환하세요.
     *
     * 조건: 모든 문자열은 한 글자 이상입니다.
     *
     * 입력: ["We", "are", "happy"]
     * 출력: ['W', 'a', 'h']
     */
    public char[] practice(String[] strlist) {
        char[] answer = new char[strlist.length];

        for(int i = 0; i < strlist.length; i++) {
            answer[i] = strlist[i].charAt(0);
        }
        return answer;
    }
}



