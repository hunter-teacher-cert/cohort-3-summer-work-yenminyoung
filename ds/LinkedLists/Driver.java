import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println("The size is now: " + l.size());
    l.add("Patootie");
    l.add("Cutie");
    l.add("Mr.");
    l.add("Hello");
    // l.add(1, "friend");
    l.add(0, "Oh!");
    System.out.println(l);
    System.out.println("Cutie is at index " + l.indexOf("Cutie"));
    System.out.println("Poo is at index " + l.indexOf("Poo"));
  

  // Create and print an array:
    System.out.println("This is the array version:");
    String[] lArray = l.toArray();
    for (int i = 0; i<lArray.length; i++){
      System.out.print(lArray[i] + " ");
    }
    System.out.println("");

    // Remove "Cutie"
    System.out.println("Remove: ");
    l.remove(4);
    System.out.println(l);
  }
}