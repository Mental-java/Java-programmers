package org.example;

public class sol5 {
    public boolean solution(String s) {
        boolean answer = true;
        if(s.length()==4||s.length()==6){
            for(char c: s.toCharArray()){
                if((int)c>=97&&(int)c<=122 || (int)c>=65 && (int)c<=90){
                    answer = false;
                }
            }
        }else{
            answer =false;
        }
        return answer;
    }
}
