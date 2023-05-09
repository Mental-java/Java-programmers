package org.example;

public class solution7 {
    public boolean solution(int x) {
        boolean answer = false;
        int y = x/10000 + x%10000/1000 + x%10000%1000/100 + x%10000%1000%100/10 +x%10000%1000%100%10/1;
        if(x%y==0) answer = true;
        return answer;
    }
}
