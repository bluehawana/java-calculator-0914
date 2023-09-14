package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to my Java calculator, please write in your calculation formula in one line, for example: 1 + 2");
        String formula = input.nextLine();
        String[] tokens = formula.split(" ");
        if (tokens.length != 3) {
            System.out.println("Your input is not qualified");
            return;}


            double a = Double.parseDouble(tokens[0]);
            double b = Double.parseDouble(tokens[2]);
            String s = tokens[1];

            double result = 0;
            switch (s) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    result = a / b;
                    break;
                default:
                    System.out.println("Your input is not qualified");
                    break;}

            System.out.println("Thank you for using my Java calculator, your result is " + result);



    }
}