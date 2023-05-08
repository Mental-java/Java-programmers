package org.example;

public class solution5 {
    //나머지가 1이 되는 수 찾기
    public int solution(int n) {
        //나머지가 1이 되려면 1보다 커야하므로 2부터 시작
        for(int i = 2; i < n; i++) {
            if(n % i == 1) return i;
            //수를 찾으면 종료
        }
        return 0;
    }

}
