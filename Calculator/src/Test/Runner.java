package Test;

import Data.Calculator;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String enter = "y";
        while(enter.equals("y")) {

            System.out.println("JAVA CALCULATOR \n" +
                    "\n" +
                    "Multiply (1) \n" +
                    "Divide (2) \n" +
                    "Sum (3)\n" +
                    "Substract (4)");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1:
                    System.out.println("What is the first number?");
                    int num1 = scanner.nextInt();
                    System.out.println("What is the second number?");
                    int num2 = scanner.nextInt();
                    System.out.println("The result of the multiplication is " + calculator.multiplyMethod(num1, num2));
                    break;
                case 2:
                    System.out.println("What is the first number?");
                    int numToDivide1 = scanner.nextInt();
                    System.out.println("What is the second number?");
                    int numToDivide2 = scanner.nextInt();
                    System.out.println("The result of the divition is " + String.format("%.2f" ,calculator.divitionMethod(numToDivide1, numToDivide2)));
                    break;
                case 3:
                    System.out.println("What is the first number?");
                    int numToSum1 = scanner.nextInt();
                    System.out.println("What is the second number?");
                    int numToSum2 = scanner.nextInt();
                    System.out.println("The result of the sum is " + calculator.sumMethod(numToSum1, numToSum2));
                    break;
                case 4:
                    System.out.println("What is the first number?");
                    int numToSubst1 = scanner.nextInt();
                    System.out.println("What is the second number?");
                    int numToSubst2 = scanner.nextInt();
                    System.out.println("The result of the substraction is " + calculator.substractMethod(numToSubst1, numToSubst2));
                    break;
                default:
                    System.out.println("That's an incorrect option");
                    break;

            }

            System.out.println("Do you want to do another operation?\n" +
                    "yes (y), no (n)");
            enter = scanner.next();

        }

    }
}
