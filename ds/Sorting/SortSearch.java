import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    // Make an ArrayList with 15 random integers of values 0-20
    public SortSearch(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(10));
	}
	
    }

    // Make an ArrayList with a specified number of random integers of values 0-20
    public SortSearch(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(10));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
      if (index < 0 || index > data.size() - 1){
        return -1;
      } else {
        return this.data.get(index);
      }
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,3,10,6,8
      if start was 2 (start at index 2, value 10) then it would return 3
      which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the other hand, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
      if (start < 0 || start > data.size() - 1){
        System.out.println("YO CHECK YOUR NUMBERS");
        return -1;
      } else {
        int smallIndex = start;
      
        for (int i=start; i<data.size(); i++){
          if (data.get(i) < data.get(smallIndex)){
            smallIndex = i;
          }
        }
      	return smallIndex;
      }
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.

	  [3, 7, 2, 8, 5]
Start:0, Index: 3, Value: 2

    [2, 7, 3, 8, 5]
Start:1, Index: 2, Value: 3

    [2, 3, 7, 8, 5]
Start:2, Index: 4, Value: 5

    [2, 3, 5, 8, 7]
Start:3, Index: 4, Value: 7

    [2, 3, 5, 7, 8]
       

    */
    public void sort(){
      for (int i = 0; i<data.size(); i++){
        int smallestIndex = findSmallestIndex(i);
        int smallestValue = data.get(smallestIndex);
        int temp = data.get(i);
        
        // data.set(index, value)
        data.set(i, smallestValue);
        data.set(smallestIndex, temp); 
      }
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
      for (int i = 0; i < data.size(); i++){
        if (data.get(i) == value){
          return i;
        }
      }
      return -1;
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
  	   create assign variables representing the high, low and middle indices 
  	   while we're not done:
  	      if the item is at data.get(middle), return middle
  	      otherwise, update high, low, and middle
    */
    public int binarySearch(int value){
      // int low = 0;
      // int high = data.size()-1;
      // int middle = (high + low)/2;
      // System.out.println("Low index: " + low);
      // System.out.println("High index: " + high);
      // System.out.println("Middle index: " + middle + "\n");

      // while (high > low){
      //   if (value > data.get(middle)){
      //     low = middle + 1;
      //     middle = (high + low)/2;
      //     System.out.println("New middle: " + middle);
      //   } else if (value < data.get(middle)) {
      //     high = middle - 1;
      //     middle = (high + low)/2;
      //     System.out.println("New middle: " + middle);
      //   } else if (value == middle){
      //     System.out.println("The value is at " + middle);
      //     return middle;
      //   }
      // }
	    return -1;
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){

	// refer to class discussion
	
	return 0;
	    
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

    
}
