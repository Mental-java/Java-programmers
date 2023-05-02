package org.example;

public class solution1 {
    public String solution(int num) {

        StringBuilder sb = new StringBuilder();
        if(num%2 ==0){
            sb.append("Even");
        }else{
            sb.append("Odd");
        }
        return sb.toString();
    }
}

// 스트링 빌더를 만들어서 num을 2로 나누었을 때 짝수라면 even추가 홀수라면 odd를 스트링 빌더에 추가함.


// 주석에 쓸 내용 : 자신이 이 문제를 어떻게 풀었는지 쓰기, 어려워서 못 풀었으면 어떤 부분이 어려웠는지 남기기.
// solution1에 첫문제 풀고 다음날 부터 솔루션2,3,4.. 클래스 만들어서 풀고 커밋하기
// gpt 사용금지.
