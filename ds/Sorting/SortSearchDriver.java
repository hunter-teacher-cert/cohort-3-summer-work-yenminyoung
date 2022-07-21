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

      System.out.println("First Occurrence:");
      System.out.println(ss.linearSearch(10) + "\n");

      // Binary Search
      System.out.println("Binary Search:");
      System.out.println("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]");
      System.out.println(ss);
      int a = 0;
      // System.out.println(a + " first occurs at " + ss.binarySearch(a));

      for (int k = 0; k<8; k++){
        System.out.println(k + " first occurs at " + ss.binarySearch(k));
      }
      
      
    }
}