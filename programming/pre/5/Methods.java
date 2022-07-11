/*
Think Java
Chapter 6
Exercises 2, 3, 8
*/

import java.io.*;
import java.util.*;

public class Methods {
  public static void main(String[] args){
    System.out.println("Exercise 2:");
    System.out.println(isDivisible(10, 2));
    System.out.println(isDivisible(10, 3));
    System.out.println("");
    
    System.out.println("Exercise 3:");
    System.out.println(isTriangle(3, 4, 5));
    System.out.println(isTriangle(1, 1, 5));
    System.out.println(isTriangle(5, 1, 1));
    System.out.println(isTriangle(1, 5, 1));
    System.out.println(isTriangle(1, 1, 1));
    System.out.println("");
    
    System.out.println("Exercise 8:");
    for (int i = 0; i<=3; i++){
      for (int j = 0; j<=3; j++){
        System.out.println("m: " + i + ", n: " + j + " --> " + ack(i, j));
      }
      System.out.println("");
    }
  }

  // Exercise 2: Check if two integers are divisible
  public static boolean isDivisible(int n, int m){
    if (n % m == 0){
      return true;
    } else {
      return false;
    }
  }

  // Exercise 3: Check if 3 sides can create a triangle
  public static boolean isTriangle(int a, int b, int c){
    if (a + b > c && b + c > a && a + c > b){
      return true;
    } else {
      return false;
    }
  }

  // Exercise 8: Ackermann function
  public static int ack(int m, int n) {
    if (m == 0){
      return n+1;
    } else {
      if (n == 0){
        return ack(m-1, 1);
      } else {
        return ack(m-1, ack(m, n-1));
      }
    }
  }
}