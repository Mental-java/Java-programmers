package org.example;

class solution1 {
    public double solution(int[] arr) {
        double answer = 0;

        for(int i = 0; i < arr.length ; i++){
            answer += arr[i];
        }
        answer = answer/arr.length;

        return answer;
        //커밋연습
    }
}
//평균 구하기
