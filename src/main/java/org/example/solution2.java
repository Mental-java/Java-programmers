package org.example;

class solution2 {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i = 0; i<arr.length; i++){
            answer = answer + (double)arr[i];
        }
        answer = answer/(double)arr.length;
        return answer;
    }
}
