import java.io.*;
import java.util.*;
import java.lang.Math;

public class Guess {
  public static void main(String[] args){
    int guess;
    Scanner in = new Scanner(System.in);
    Random rando = new Random();
    int r = rando.nextInt(100) + 1;
    int diff;
    
    System.out.println("I am thinking of a number between 1 and 100 (inclusive). Can you guess what it is?");
    System.out.print("Type a number: ");
    guess = in.nextInt();
    System.out.println("I was thinking of the number " + r);
    diff = r-guess;
    System.out.println("You were off by " + Math.abs(diff));
  }
}