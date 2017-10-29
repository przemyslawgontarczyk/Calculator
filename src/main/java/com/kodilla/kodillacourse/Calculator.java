package com.kodilla.kodillacourse;

public class Calculator {

    int x;
    int y;

    public Calculator(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int sumXY(){

        int sum = x+y;
        return sum;
    }
    public int subbXY() {

        int sub = x - y;
        return sub;
    }

    public static void main (String[] args){

        Calculator Sumcalc = new Calculator(100,50);
        Calculator Subcalc = new Calculator(100,50);

        System.out.println("Wynik dodawania =  " +Sumcalc.sumXY());
        System.out.println("Wynik odejmowania =  " +Subcalc.subbXY());
    }

}