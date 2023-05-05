package org.example;

public class sol3 {
    boolean solution(String s) {
        int pcnt =0;
        int ycnt =0;
        String small = s.toLowerCase();
        for(char c: small.toCharArray()){
            if(c=='p'){
                pcnt++;
            }else if(c=='y'){
                ycnt++;
            }
        }
        if(pcnt==ycnt){
            return true;
        }else{
            return false;
        }
    }
}

// s문자열 다 소문자로 바꾸고 foreach로 p와 y개수 세고 리턴해준다
