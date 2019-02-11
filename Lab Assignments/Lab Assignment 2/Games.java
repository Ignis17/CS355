/*
  Name: Joel Turbi
  Assignment: Games Library
  Course: CS 355
  Professor: Dr. Zavala
  Date: 02/11/2019
*/

// Definitions of library
import java.util.*;
import java.lang.*;
import java.io.*;

// Games library Definition:
class Games{
  public static String poem(String name){
    return("My student " + name + " standing proud, is a fine example for the crowd.");
  }

  public static String fortuneTeller(String name)
  {
    String [] fortune = {"Skills comes from diligence.","Pleasures awaits you by the sea.","Beauty surrounds you because you create it.","The star of riches is shinning on you.","You are one smart cookie!"};
    int number = (int) (Math.random() * fortune.length);
    return("Here is your fortune " + name + ":\n" + fortune[number]);
  }

  /public static String madLibs(String [] inputs){
    return("Sleep-" + inputs[0] + "is a/an " + inputs[1] " phenomenon that a surprising number of " + inputs[2] + "experience. Usually, sleepwalkers climb out of their " + inputs[3] + " and begin to " + inputs[4] + " with their " + inputs[5] + " tightly shut. Sometimes they " + inputs[6] + " outdoors wearing only their " + inputs[7] + " pajamas.");
    // Shorten the mabLibs.
  }

}
