package Solution;

class Solution {
    // 짝수일 경우 Even, 홀수일 경우 Odd 리턴.
    public String solution(int num) {
        String answer = "";
        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";
        return answer;
    }
}