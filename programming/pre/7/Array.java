/*
Think Java
Chapter 8.12
Exercise 1

*/
import java.io.*;
import java.util.*;

public class Array {
  public static void main(String[] args){
    System.out.println("Part 1:");
    double[] example1 = {1, 2, 3, 4, 5};
    printDArray(example1);
    printDArray(powArray(example1, 2));
    printDArray(powArray(example1, 3));
    System.out.println("");
    System.out.println("Part 2:");
    int[] scores = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95, 99}; // 10 different grades
    printIArray(scores);
    printIArray(histogram(scores, 10));
    
  }

  // Exercise 1.1
  public static double[] powArray(double[] a, int n){
    double[] newArray = new double[a.length];
    for (int i = 0; i<a.length; i++){
      newArray[i] = Math.pow(a[i], n);
    }
    return newArray;
  }

  // Exercise 1.2
  public static int[] histogram(int[] scores, int n){
    int[] counts = new int[n];  // {0-10, 10-20, 20-30, 30-40, 40-50, 50-60, 60-70, 70-80, 80-90, 90-100}
    for (int i = 0; i<scores.length; i++){ // go through each score
      int temp = scores[i];               // store that score in "temp"
      int bin = temp/n;                  // take that score and divide it by 10. the integer value will put it in the right counts index
      counts[bin]++;
    }
    
    // int a = inRange(scores, 90, 100);
    // int b = inRange(scores, 80, 90);
    // int c = inRange(scores, 70, 80);
    // int d = inRange(scores, 60, 70);
    // int f = inRange(scores, 0, 60);
    return counts;
  }

  // Print double array
  public static void printDArray(double[] a){
    for (int i = 0; i<a.length; i++){
      System.out.print(a[i] + "  ");
    }
    System.out.println("");
  }
  
  // Print int array
  public static void printIArray(int[] a){
    for (int i = 0; i<a.length; i++){
      System.out.print(a[i] + "  ");
    }
    System.out.println("");
  }

  // count number of elements in an array that fall between the range
  public static int inRange(int[] a, int low, int high){
    int count = 0;
    for (int i=0; i<a.length; i++){
      if (a[i] >= low && a[i] < high){
        count++;
      }
    }
    return count;
  }

  
}