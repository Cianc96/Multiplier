//Simple Multiplier of two numbers with user inputs 

import java.util.Scanner;
 
public class QuickMaths{
   public static void main(String[] args){

    double num1;
    double num2;

    Scanner input;
    input = new Scanner(System.in);

    System.out.print("enter a number:");
    num1 = input.nextDouble();

    System.out.print("Another number please");
    num2 = input.nextDouble();

    double result = num1 * num2;

    System.out.println("The result is" + result);
    input.close();
    }
  }
