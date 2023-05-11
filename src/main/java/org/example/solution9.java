package org.example;

public class solution9 {
    //콜라츠 추측
    public long solution(long num) {
        long answer = 0;
        if(num == 1) return 0;
        while(num != 1) {
            if(answer >= 500) return -1;
            if(num % 2 == 0) num /= 2;
            else num = num*3 + 1;
            answer++;
        }
        return answer;
    }
}
