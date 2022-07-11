/*
Think Java
Chapter 7.9
Exercise 2, 3, 4

*/
import java.io.*;
import java.util.*;

public class Loops {
  public static void main(String[] args){
    System.out.println("Exercise 2: ");
    System.out.println(squareRoot(49.0));
    System.out.println("");
    
    System.out.println("Exercise 3: ");
    System.out.println(power(2.22, 5));
    System.out.println("");
    
    System.out.println("Exercise 4: ");
  }

  // Exercise 2: Approximate the square root
  public static double squareRoot(double x){
    double n = x/2;
    double result = (n + x/n)/2;
    while (n - result > 0.0001){
      n = result;
      result = (n + x/n)/2;
    }
    
    return result;
  }

  // Exercise 3: power
  public static double power(double x, int n){
    for (i = )
  }
}