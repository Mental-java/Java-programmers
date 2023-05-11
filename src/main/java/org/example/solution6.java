package org.example;

public class solution6 {
    //문자열 다루기 기본
    public boolean solution(String s) {
        boolean answer = true;
        int n = s.length();
        if(n != 4 && n != 6) return false;      //조건 불만족시 종료
        for(char c : s.toCharArray()) {
            //int 형으로 바꾼 문자가 숫자 범위 바깥이라면 false 반환.
            if( (int) c < 48 || (int) c > 57) return false;
        }
        return answer;
    }
}
