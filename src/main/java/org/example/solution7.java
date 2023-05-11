package org.example;

public class solution7 {
    public boolean solution(int x) {
        boolean answer = false;
        String num = Integer.toString(x);       //문자열로 변환
        int sum = 0;
        for(char c : num.toCharArray()) {
            sum += (int) c - '0';               //숫자로 변환
        }
        if(x % sum == 0) answer = true;         //하샤드 수인지 확인
        return answer;
    }
}
