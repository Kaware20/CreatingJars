package com.pack.revature;

public class Main {
    public static void main(String[] args) {
        System.out.println("Result is : " +checkIfInputIsAnEvenNumber(122)); 
        System.out.println("Hello World");// Testing in the main method
    }
    public static boolean checkIfInputIsAnEvenNumber(int number){
        return number % 2 == 0;
    }
}
