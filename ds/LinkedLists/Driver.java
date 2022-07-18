import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    l.add("Patootie");
    l.add("Cutie");
    l.add("Mr.");
    l.add("Hello");
    // l.add(1, "friend");
    l.add(0, "Oh!");
    System.out.println(l);
    System.out.println("Cutie is at index " + l.indexOf("Cutie"));
  

  // Create and print an array:
    System.out.println("This is the array version:");
    String[] lArray = l.toArray();
    for (int i = 0; i<lArray.length; i++){
      System.out.print(lArray[i] + " ");
    }
    System.out.println("");

    // Remove "Cutie"
    System.out.println("Remove cutie: ");
    l.remove(3);
    System.out.println(l);
  }
}