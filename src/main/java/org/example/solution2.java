package org.example;

class solution2 {
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0 ){
            answer = "Even";
        }
        else{
            answer = "Odd";
        }

        return answer;
    }
}
//짝수와 홀수