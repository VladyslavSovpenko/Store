package org.example;

public class Main {


    public static void main(String[] args) {
        CalculatePrice calculatePrice = new CalculatePrice();
        calculatePrice.printResult(calculatePrice.calculate("ABCDABA"));
    }
}
