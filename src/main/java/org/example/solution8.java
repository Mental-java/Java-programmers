package org.example;

import java.util.*;

class solution8 {
    public String solution(String[] seoul) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int x = 0;
        for(int i = 0; i<seoul.length; i++){
            if("Kim".equals(seoul[i])){
                x = i;
            }
        }
        sb.append("김서방은 ");
        sb.append(Integer.toString(x));
        sb.append("에 있다");
        answer = sb.toString();
        return answer;
    }
}
