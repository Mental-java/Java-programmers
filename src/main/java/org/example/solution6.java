package org.example;

public class solution6 {
    public boolean solution(String s) {
        boolean answer = true;
        char [] arr = s.toCharArray();

        if(arr.length!=4 && arr.length!=6){
            return false;
        }
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<'0' || arr[i]>'9'){
                return false;
            }
        }
        return answer;
    }
}
