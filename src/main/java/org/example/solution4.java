package org.example;

public class solution4 {
    // 문자열 내 p와 y의 개수
    public boolean solution(String s) {
        boolean answer = true;
        String py = s.toLowerCase();
        int p = 0, y = 0;

        for(char x : py.toCharArray()) {
            if(x == 'p') p++;
            if (x == 'y') y++;
        }
        if(p != y) answer = false;

        return answer;
    }
}
