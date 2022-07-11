import java.io.*;
import java.util.*;

public class Beer {
  public static void main(String[] args){
    countdown(99);
  }

  public static void countdown(int n) {
    String b = redefine(n);
    if (n > 0){
      System.out.println(n + " " + b + " of beer on the wall,");
      System.out.println(n + " " + b + " of beer,");
      System.out.println("ya take one down, ya' pass it around,");
      n --;
      b = redefine(n);
      System.out.println(n + " " + b + " of beer on the wall.");
      System.out.println("----------");
      countdown(n);
    }
    if (n == 0) {
      return;
    }
  }

  public static String redefine(int n) {
    if (n == 1){
        return "bottle";
      } else {
        return "bottles";
      }
  }
}