package com.sda.calc;

public class Calculator {


    public int multiplyNumbers(int start, int end, int step){

        for (int i = start + step; i < end; i += step) {
            start = start * i;
        }
            return start;
    }

    public int multiplyNumbers(int start, int end){
        for (int i = start + 1; i < end; i++) {
            start = start * i;
        }
        return start;
    }

    public int multiplyNumbers(int end){

        int sum = 0;

        for (int i = 1; (i + 1) < end; i++) {
            sum = i * (i+1);
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.multiplyNumbers(2,10,3));
        System.out.println(calculator.multiplyNumbers(2,5));
        System.out.println(calculator.multiplyNumbers(4));

    }
}
