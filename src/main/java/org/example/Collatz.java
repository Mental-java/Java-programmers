package org.example;

public class Collatz {
    public int solution(long num) {
        int cnt =1;
        if(num == 1){
            return 0;
        }
        while(cnt<=500){
            if(num%2==0){
                num /=2;
            }else{
                num *= 3;
                num += 1;
            }
            if(num ==1){
                return cnt;
            }
            cnt ++;
        }

        return -1;
    }
}
