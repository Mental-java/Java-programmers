package org.example;

public class solution3 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(char x : str.toCharArray()){
            int a = x - 48;
            answer = answer + a;
        }
        return answer;
    }
}
