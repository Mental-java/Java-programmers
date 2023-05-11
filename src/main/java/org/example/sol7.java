package org.example;

public class sol7 {
    public String solution(String[] seoul) {
    String location;
    for(int i=0; i<seoul.length; i++){
        if(seoul[i].equals("Kim")){
            location = Integer.toString(i);
            return "김서방은 "+location+"에 있다";
        }
    }
    return "kim 없음";
}
}
