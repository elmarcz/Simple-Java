/*
    The while loop executes a block of code and repeats the execution as 
    long as a certain condition expressed in the while clause is met.
*/
package java.Loops;

import java.util.Scanner;

public class DoWhileLoop {

  public static void main(String[] args) {
    int response = 0;

    do {
      System.out.println("Select the number of the desired option.");
      System.out.println("1. Movies");
      System.out.println("2. Series");
      System.out.println("0. Exit");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 0:
          System.out.println("Thanks for your visit");
          break;
        case 1:
          System.out.println("You have selected Movies");
          break;
        case 2:
          System.out.println("You have selected Series");
          break;
        default:
          System.out.println("Please, select a valid option");
          break;
      }
    } while (response != 0);
  }
}
