/* Name: Joel Turbi
  Assignment: Fortune Teller Lab 1
  Course: CS 355
  Professor: Dr. Zavala
  Date: 02/06/2019 */

  import java.util.*;
  import java.lang.*;
  import java.io.*;

  public class FortuneTeller
  {
    public static void main(String [] args)
    {
      System.out.println("Enter your name: ");
      Scanner in = new Scanner(System.in);
      String name = in.next();
      String [] fortune = {"Skills comes from diligence.","Pleasures awaits you by the sea.","Beauty surrounds you because you create it.","The star of riches is shinning on you.","You are one smart cookie!"};
      int number = (int) (Math.random() * fortune.length + 1);

      System.out.println("Here is your fortune " + name + ":");
      System.out.println(fortune[number]);
    }
  }
