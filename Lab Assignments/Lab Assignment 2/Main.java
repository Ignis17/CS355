/*
  Name: Joel Turbi
  Assignment: Lab Assignment 2 - Games Library.
  Course: CS 355
  Professor: Dr. Zavala
  Date: 02/11/2019
*/

// Definitions of library
import java.util.*;
import java.lang.*;
import java.io.*;
//import Games.*;

// Main class Definition:
class Main{
public static void main(String [] args) {
System.out.println("WELCOME");
System.out.println("1 - Poem");
System.out.println("2 - Fortune Teller");
System.out.println("3 - MadLibs");
System.out.println("");
System.out.println("Choose a game: ");
Scanner in = new Scanner(System.in);
int choice = in.nextInt();
switch(choice){
  case 1:
    System.out.println("\nEnter your name:");
    String name1 = in.next();
    System.out.println(Games.poem(name1));
    break;
  case 2:
    System.out.println("\nEnter your name:");
    String name2 = in.next();
    String fortuneOut = Games.fortuneTeller(name2);
    System.out.println(fortuneOut);
    break;
  case 3:
    String [] inputs= new String [15];
    String [] choices = {"verb, ending in \"ING\"", "adjective", "plural noun", "plural noun", "verb", "part of a body (plural)", "verb", "adjective", "noun", "noun", "plural noun", "adjective", "noun", "silly word", "plural noun"};
    for(int i=0; i < 15; i++){
      System.out.println("Enter a " + choices[i] + ":");
      String input = in.next();
      inputs[i] = input;
    }
    System.out.println(Games.madLibs(inputs));
    break;
  default:
    System.out.print("\nInvalid choice, try again.");
  }
}
}
