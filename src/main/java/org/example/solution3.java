package org.example;

public class solution3 {
    //자릿수 더하기
    public int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        for(char x : num.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(x));
        }
        return answer;
    }
    /*
        1. 정수 n을 문자열로 변환
        2. 문자열을 문자 단위로 반복하며 각 문자를 정수로 바꾸고 answer에 누적
    */
}
