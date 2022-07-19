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
      System.out.println(ss.linearSearch(10));


	      

    }
}