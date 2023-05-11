package org.example;

public class solution9 {
    //매개변수의 자료형이 int이면 오버플로우 발생으로 자료형을 long으로 바꿔줘야함
    public int solution(long num) {
        int answer = 0;
        while(num != 1){
            answer++;
            if(answer==500){
                answer = -1;
                break;
            }
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
        }
        return answer;
    }
}
