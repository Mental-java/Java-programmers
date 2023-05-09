package org.example;

public class sol6 {
    public boolean solution(int x) {
        int n = x;
        int j =10;
        int sum = 0;
        while(n >0){
            int i=0;
            i = n%j;
            n /=j;
            sum += i;
        }
        if(x % sum ==0){
            return true;
        }else{
            return false;
        }
    }
}
