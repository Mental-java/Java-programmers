package org.example;

public class solution2 {
    //평균 구하기
    public double Solution(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;
        return average;
    }
}
