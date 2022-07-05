/**
 * Game of Nim by Team 11
 * Yenmin Young
 * collaborators: Richard Parker, Edwin Lara, Adam Prado
 */

import java.io.*;
import java.util.*;
import java.util.Random;

public class Nim{
  public static void main(String[] args) {
    int stones = 12;  // initialize stones
    int stonesTaken = 0;  // initialize stonesTaken
    int machineTurn;
    Random rand = new Random();

    Scanner input = new Scanner(System.in);

    // loop until game ends
    while(stones > 0){
      // prompt user for input: user's turn  
      System.out.print("How many stones do you want to take? ");
      stonesTaken = input.nextInt();
      while (stonesTaken < 1 || stonesTaken > 3 || stonesTaken > stones){
        System.out.println("Take between 1 and 3 stones!");
        System.out.println("Stones still in bag: " + stones);
        System.out.print("How many stones do you want to take? ");
        stonesTaken = input.nextInt();
        System.out.println("You took " + stonesTaken + " stones.");
      }

      // calculate # of stones remaining and print
      System.out.println("You took " + stonesTaken + " stones.");
      stones = stones - stonesTaken;
      System.out.println("There are now " + stones + " stones left in the bag.");

      // check for win
      if (stones == 0){
      System.out.println("You win!");
      System.exit(0);
      }

      // machine turn
      machineTurn = rand.nextInt(3)+1;
      System.out.println("The MACHINE has chosen " + machineTurn + " stones.");

        
      // calculate # of stones remaining and print
      stones = stones - machineTurn;
      System.out.println("There are now " + stones + " stones left in the bag.");

      // check for win
      if (stones == 0){
        System.out.println("The computer won. You lose!");
        System.exit(0);
      }
      
    }
    System.out.print("Game Over!");
  }
  
}