import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team 13
 * Yenmin Young
 * collaborators: Jenna Lin, Ashley Ufret, Erwin Lara
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   Add code in main to test all your methods
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	    Time t;
      Time v;

	//assign var the address of a newly-apportioned Time object
    	t = new Time(10, 3, 2);
      v = new Time(5, 4, 1);
      String blaht = t.toString();
      String blahv = v.toString();
      System.out.println(blaht);
      System.out.println(blahv);

      t.add(v);
      t.equals(v);
      t.compareTo(v);
      
    }//end main()

}//end class