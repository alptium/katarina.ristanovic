package calculator;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
   
    int num1;
    int num2;
    String operation;

    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter first number");
    num1 = sc.nextInt();

    System.out.println("Please enter second number");
    num2 = sc.nextInt();

    Scanner op = new Scanner (System.in);

    System.out.println("Please enter operation");
    operation = op.next();

    if (operation.equals("+")){
        System.out.println("Your answer is "+(num1 + num2));
    }
    else if (operation.equals("-"))
    {
        System.out.println("Your answer is "+(num1 - num2));
    }       
    else if (operation.equals("*"))
    {
        System.out.println("Your answer is "+(num1 * num2));
    }   
    else if (operation.equals("/"))
    {
        System.out.println("Your answer is "+(num1 / num2));
    }
}}
