import java.io.*;
import java.util.*;

public class SortSearchReferenceDriver {
  public static void main(String[] args) {
    int size = 1000;

    // Create a new arrayList of size 1000 and it will be sorted. We are also timing how long it takes to sort it.
    SortSearchReference ss = new SortSearchReference(size);
    // printing is really slow so we don't want to print when testing time.
    // System.out.println(ss);
    long start, elapsed;
    start = System.currentTimeMillis();
    ss.sort();
    // System.out.println(ss);
    elapsed = System.currentTimeMillis() - start;
    System.out.println("Size: " + size + " Time: " + elapsed);
           

    // Create a new arrayList of size 20. It's already sorted to be increasing. 
    ArrayList<Integer> a = ss.buildIncreasingList(20);
    System.out.println("List1: " + a);
  
    // Build a second Arraylist here
    ArrayList<Integer> b = ss.buildIncreasingList(20);
    System.out.println("List2: " + b);
  
    // Test your merge routine here
    System.out.println("newList: " + ss.merge(a, b));
  }
}