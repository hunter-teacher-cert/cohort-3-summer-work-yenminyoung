import java.io.*;
import java.util.*;

/* 
   Search Project:
   1. Complete the linear search (BASIC)
   2. Complete the binary search (Intermediate)
   3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearchReference{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    
    public SortSearchReference(){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<15;i++){
	    data.add(r.nextInt(20));
	}
    }
    
    public SortSearchReference(int size){
	data = new ArrayList<Integer>();
	r = new Random();
	for (int i=0;i<size;i++){
	    data.add(r.nextInt(20));
	}
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	return this.data.get(index);
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

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
	int smallIndex = start;
	int i;
	for (i=start;i<data.size();i++){
	    if (data.get(i) < data.get(smallIndex)){
		smallIndex = i;
	    }
	    
	}
	
	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
         For each index, find the smallest from that Location
	 to the end of the array and swap it with that index.
    */
    public void sort(){
	int i;
	int tmp;
	int smallIndex;
	for (i=0;i<data.size();i++){
	    smallIndex = findSmallestIndex(i);
	    tmp = data.get(smallIndex);
	    data.set(smallIndex,data.get(i));
	    data.set(i,tmp);
  }
    }



    /* Search project starts here */
    
    /*
      performs a linear search. Returns the index of the first occurence of
      value in the ArrayList data or -1 if not found.

      This works by starting at the first element and searching one element at a time 
      until either the element is found or you've looked at all the elements.

      This algorithm works on any ArrayList.
    */
    public int linearSearch(int value){
	int i = 0;
	for (i=0;i<data.size();i++){
	    if (data.get(i)==value)
		return i;
	}
	return -1;
	
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices
	int high, low, middle;

	high = data.size();
	low  = 0;
	
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
	while (high >= low){
	    middle = (high+low)/2;

	    if (data.get(middle)==value){
		return middle;
	    } else if (data.get(middle) > value){
		high = middle - 1;
	    } else {

		low = middle + 1;
	    }
	    
		}
	
	return -1;
	    
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){
	if (lowIndex > highIndex)
	    return -1;
	
	int middle = (lowIndex + highIndex)/2;

	if (data.get(middle)==value){
	    return middle;
	} else if (data.get(middle) > value){
	    return binarySearchRecursive(value,lowIndex,middle-1);
	} else {
	    return binarySearchRecursive(value,middle+1,highIndex);
	}
	
	    
    }
    public int binarySearchRecursive(int value){
	return binarySearchRecursive(value,0,data.size());
    }
    
	
    public String toString(){
	return ""+data;
    };


    public void builtinSort(){
	Collections.sort(data);
	
    }
    

  /* Merge Sort Stuff after here */
  /*
    Builds and returns an ArrayList that's already in increasing order.
    You can use this method to test your merge method.
  */
  public ArrayList<Integer> buildIncreasingList(int size){
  	ArrayList<Integer>  newlist = new ArrayList<Integer>();
  	Random r = new Random();
  	int nextval = r.nextInt(20)+1;
  	for (int i=0;i<size;i++){
      newlist.add(nextval);
      nextval = nextval + r.nextInt(20);
  	  }
  	return newlist;
  }

  /*
    This routine should create and return a new ArrayList of
    integers and fill it by merging list1 and list2 into the new list.

    list1 and list2 are already sorted in increasing order.

    Example:
    If list1 contains [1,5,17,25]
    and list2 contains [3,6,10,30,40,50]

    The new list will contain:
    [1, 3, 5, 6, 10, 17, 25, 30, 40, 50] 
  */
       
  public ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2){
    ArrayList<Integer> newList = new ArrayList<Integer>();

    // METHOD 1 -------------
    // Compare the first two of each one. The smaller one gets added to the newList. Increase the index of the list that was just added. Repeat until one of the lists reaches the end.

    int i = 0;
    int j = 0;
    // merge the two until one of them runs out
    while (i < list1.size() && j < list2.size()){
      if (list1.get(i) <= list2.get(j)){
        newList.add(list1.get(i));
        i++;
      } else if (list2.get(j) < list1.get(i)){
        newList.add(list2.get(j));
        j++;
      }
    }
    // Which index did we end up on?
    // System.out.println("i: " + i + ", j: " + j);

    // Add the rest of the remaining list
    // If list2 was finished through, add the rest of list1
    // If list1 was finished through, add the rest of list2
    if (j == list2.size()){
      while (i < list1.size()){
        newList.add(list1.get(i));
        i++;
      }
    } else if (i == list1.size()){
      while (j < list2.size()){
        newList.add(list2.get(j));
        j++;
      }
    }
    // END METHOD 1 -------------


    // METHOD 2 -------------
    // Remove the first index each time you add it to the newList
    // while (list1.size() > 0 && list2.size() > 0){
    //   if (list1.get(0) <= list2.get(0)){
    //     newList.add(list1.get(0));
    //     list1.remove(0);
    //   } else if (list1.get(0) > list2.get(0)){
    //     newList.add(list2.get(0));
    //     list2.remove(0);
    //   }
    // }

    // // Add the rest of the remaining list
    // while (list1.size() > 0){
    //   newList.add(list1.get(0));
    //   list1.remove(0);
    // }
    // while (list2.size()>0){
    //   newList.add(list2.get(0));
    //   list2.remove(0);
    // }
    // END METHOD 2 -------------
  	return newList;
  }

  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){

      // check for base case
    if (list.size() < 2){
      return list;
    } else {  // if not the base case
      // split in two lists
      ArrayList<Integer> listLeft = new ArrayList<Integer>();
      ArrayList<Integer> listRight = new ArrayList<Integer>();
      int middleIndex = list.size()/2;
      // System.out.println("The middle index is: " + middleIndex);
      for (int i = 0; i < middleIndex; i++){
        listLeft.add(list.get(i));
      }
      for (int i = middleIndex; i<list.size(); i++){
        listRight.add(list.get(i));
      }

      listLeft = mergeSort(listLeft);  // magically sorts the numbers
      listRight = mergeSort(listRight);
      
      // System.out.println("Left List: " + listLeft);
      // System.out.println("Right List: " + listRight);
      
      // merge them together into a new list
      list = merge(listLeft, listRight);
      // return that new list 
      return list;
    }
  }


  public void msort(){
      data =  mergeSort(data);
  }
}