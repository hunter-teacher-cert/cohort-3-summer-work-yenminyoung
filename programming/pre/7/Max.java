/*
Think Java
Chapter 8.12
Exercise 4

*/
import java.io.*;
import java.util.*;

public class Max {
  public static void main(String[] args){
    int[] example = {1, 2, 7, 4, 5, 3, 5, 2, 0};
    printIArray(example);
    System.out.println("You can find the largest value of that array in index: " + indexOfMax(example));
  }

  // Exercise 4
  public static int indexOfMax(int[] a){
    int biggestValue = a[0];
    int biggestIndex = 0;
    for (int i = 0; i<a.length-1; i++){
      if (a[i+1] > biggestValue){
        biggestIndex = i+1;
      }
    }
    return biggestIndex;    
  }

  // Print int array
  public static void printIArray(int[] a){
    for (int i = 0; i<a.length; i++){
      System.out.print(a[i] + "  ");
    }
    System.out.println("");
  }

  
}

// No you can't use the enhanced for loop here because our for loop uses "i<a.length-1"