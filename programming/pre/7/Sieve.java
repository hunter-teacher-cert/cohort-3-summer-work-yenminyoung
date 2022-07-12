/*
Think Java
Chapter 8.12
Exercise 5

*/
import java.io.*;
import java.util.*;

public class Sieve {
  public static void main(String[] args){
    int maxN = 19;
    int[] numbers = new int[maxN];
    for (int i = 0; i<numbers.length; i++){
      numbers[i] = i + 2;
    }
    printIArray(numbers);
    printBArray(sieve(numbers, maxN));
  }

  // Exercise 5
    public static boolean[] sieve(int[] a, int n){
      // Create a new array full of trues
      // True = it is prime
      boolean[] prime = new boolean[n];
      for (int i = 0; i<prime.length; i++){
        prime[i] = true;
      }

      // Starting with p = 2, go through each element and see if it is divisible by 2. If it is, then make it false.
      // Then increment p to be 3. Go through each element and see if it is divisible y 3.
      for (int p = 2; p<a.length-1; p++){
        for (int i = p-1; i<a.length; i++){
          if (a[i]%p == 0){
            prime[i] = false;
          }
        }
      }
      return prime;
  }

  // Print int array
  public static void printIArray(int[] a){
    for (int i = 0; i<a.length; i++){
      System.out.print(a[i] + "  ");
    }
    System.out.println("");
  }
  
  // Print boolean array
  public static void printBArray(boolean[] a){
    for (int i = 0; i<a.length; i++){
      System.out.print(a[i] + "  ");
    }
    System.out.println("");
  }

  
}