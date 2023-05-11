package org.example;

public class solution8 {
    String answer = "";
    public String solution(String[] seoul) {
        int i = 0;
        for(i = 0; i < seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}
