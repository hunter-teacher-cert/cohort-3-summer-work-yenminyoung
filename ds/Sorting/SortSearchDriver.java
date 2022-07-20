import java.io.*;
import java.util.*;

public class SortSearchDriver {
    public static void main(String[] args) {


    	// Uncomment these to test part 1
    	
    	SortSearch ss = new SortSearch(10);
    	System.out.println(ss + "\n");
    	
    		
    	// Uncomment these to test part 2
    
    	int i;
    	i = ss.findSmallestIndex(0);
    	System.out.println("ss["+ i +"] = "+ss.get(i)+" : " + ss);
    
    	i = ss.findSmallestIndex(3);
    	System.out.println("ss["+ i + "] = "+ss.get(i)+" : " + ss + "\n");
    	
    	// Uncomment these to test part 3
    
      System.out.println("Sort this ArrayList");
    	System.out.println(ss);
    	ss.sort();
    	System.out.println(ss + "\n");
    
      // Part 4!

      System.out.println("First Occurance:");
      System.out.println(ss.linearSearch(10) + "\n");

      // Binary Search
      // System.out.println("Binary Search:");
      // System.out.println(ss);
      // System.out.println("What's the index for the value 8? " + ss.binarySearch(8));
      // // System.out.println("What's the index for the value 8? " + ss.binarySearch(8));


      // MAke your own arraylist
      ArrayList<Integer> boo = new ArrayList<Integer>();
      for (int j=0;j<15;j++){
  	    boo.add(j);
  	  }
      System.out.println(boo + "\n");
      System.out.println("Binary Search:");
      System.out.println("What's the index for the value 8? ");
      boo.binarySearch(8);
      // System.out.println("What's the index for the value 8? " + ss.binarySearch(8));

	  //but can you run our sorting functions on this list?  That was the problem.  We think we need to put this into a constructor in the SortSearch.java file    

    }
}