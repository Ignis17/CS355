/* Name: Joel Turbi
  Assignment: Poem Lab 1
  Course: CS 355
  Professor: Dr. Zavala
  Date: 02/06/2019 */

import java.util.*;
import java.lang.*;
import java.io.*;

public class Poem{
  public static void main(String [] args)
  {
    System.out.print("What is your name: ");
    Scanner in = new Scanner(System.in);
    String name = in.next();
    System.out.println("My student " + name + " standing proud, is a fine example for the crowd.");
  }
}
