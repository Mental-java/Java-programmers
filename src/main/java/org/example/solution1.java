package org.example;

public class solution1 {
    public double solution(int[] arr) {
        double answer = 0;
        double tot =0;
        for(int i: arr){
            tot += i;
        }
        answer = tot/(arr.length);
        return answer;
        //커밋테스트
    }
}


// 주석에 쓸 내용 : 자신이 이 문제를 어떻게 풀었는지 쓰기, 어려워서 못 풀었으면 어떤 부분이 어려웠는지 남기기.
// solution1에 첫문제 풀고 다음날 부터 솔루션2,3,4.. 클래스 만들어서 풀고 커밋하기
// gpt 사용금지.
