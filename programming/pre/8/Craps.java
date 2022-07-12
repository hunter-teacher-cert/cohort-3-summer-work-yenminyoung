/*
Think Java
Chapter 9
Final Project

A round is played as follows:

The shooter shoots (rolls) the dice.

If he rolls a 2,3, or 12,that’s Craps and he loses.
If he rolls a 7 or 11, that’s a Natural and he wins.
Otherwise:
the value he rolled is now called the Point
the shooter continues to shoot (roll) until he either rolls the Point again at which point he wins or he rolls a 7 at which point he loses.

When done, add and push Craps.java to GitHub.
*/
import java.io.*;
import java.util.*;

public class Craps {
  //The main program should take a parameter from the command line, play that many rounds and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    System.out.print("How many rounds do you want to play? ");
    int numberOfRounds = input.nextInt();

    for (int i = 0; i<numberOfRounds; i++){
      int r = i + 1;
      System.out.println("Round " + r);
      System.out.println("Won round " + r + "? " + round());
      System.out.println("Let's play again! \n");
    }
    
    
    
  }

  // Accepts an integer parameter and returns a random number between 1 and that number, inclusive.
  public static int roll(int n){
    Random r = new Random();
    int randomNumber = r.nextInt(n) + 1; // Random number between 1 and n (not including n+1)
    return randomNumber; // returns a random number
  }

  // Accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice.
  public static int shoot(int n, int m){
    int sum = 0;
    for (int i = 0; i < n; i++){
      sum += roll(m);
    }
    return sum;
  }

  // Accept no parameters and it should return something to indicate if the shooter of the round wins or loses.
  public static boolean round(){
    int r1 = shoot(2,6);
    int point = 0;
    System.out.println("First roll: " + r1);

    if (r1 == 2 || r1 == 3 || r1 == 12){
      System.out.println("CRAP! yOu LoSt");
      return false;
    } else if (r1 == 7 || r1 == 11){
      System.out.println("NATURAL! You win!");
      return true;
    } else {
      point = r1;
      int r2 = shoot(2,6);
      System.out.println("Next roll is " + r2);
      
      while (r2 != point || r2 != 7){
        if (r2 == point){
        System.out.println("You win!");
        return true;
      } else if (r2 == 7){
        System.out.println("yOu LoSt");
        return false;
      } else {
        r2 = shoot(2,6);
        System.out.println("Next roll is " + r2);
      }
      }
      

      
      
    }
    return false;
  }
}