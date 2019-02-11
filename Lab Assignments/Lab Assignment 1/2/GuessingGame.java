/* Name: Joel Turbi
  Assignment: Guessing Game Lab 1
  Course: CS 355
  Professor: Dr. Zavala
  Date: 02/06/2019 */

import java.lang.Math;
import java.util.Scanner;

public class GuessingGame
{
  public static void main(String[] arg)
  {
    Boolean found = true;
    Scanner scanner = new Scanner(System.in);
    int number = (int) (Math.random() * 100 + 1);
    while(found == true)
    {
      System.out.print("Enter your guess: ");
      int guess = scanner.nextInt();

      if (guess<number)
      {
        System.out.println("Guess was too low");
      }
      else if (guess>number)
      {
        System.out.println("Guess was too high");
      }
      else
      {
        System.out.println("Correct, the number was " + number);
        found = false;
      }
    }
  }
}
