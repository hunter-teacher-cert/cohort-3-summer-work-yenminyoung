import java.io.*;
import java.util.*;

/** Methods to write

Basic level:
------------
public static ArrayList<Integer> buildRandomList(int size, int maxval)
public static int sumOfList(ArrayList<Integer> dataList)

Intermediate level:
-------------------
public static void swapElements(ArrayList<Integer> dataList, int indexA,int indexB)
public static void removeValue(ArrayList<Integer> dataList, int valueToRemove)

Challenge level:
-------------------
public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB)
*/


public class ALPractice{

  /**
  Parameters:
  - size - an integer representing how many items to add to the list
  - maxval - the largest value to store in the list
  Preconditions:
  - size >= 0
  - maxVal > 0
  Returns:
  - A new ArrayList of Integers with each value being a random
    number between 0 and maxval (not including maxval).
  */
  public static ArrayList<Integer> buildRandomList(int size, int maxval){
    Random r = new Random();
    ArrayList<Integer> randomArray = new ArrayList<Integer>(size);
    for (int i=0; i<size; i++){
      randomArray.add(r.nextInt(maxval));
    }
    return randomArray;
  }

  /**
  Parameters:
  - dataList - an ArrayList of integer values.
  Returns:
  - The sum of all of the elements of the ArrayList.
  */
  public static int sumOfList(ArrayList<Integer> dataList){
    int sum = 0;
    for (int i = 0; i<dataList.size(); i++){
      sum += dataList.get(i);
    }
    return sum;
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - index1, index2 - the two locations to swap.
  Preconditions:
  - index1 and index2 are valid indecies of dataList
  Postconditions:
  - The ArrayList is modified such that
    The value that was in dataList[index1] is now in dataList[index2], and
    the value  that was in dataList[index2] is now in dataList[index1].
  - No other values should be modified.
  */
  public static void swapElements(ArrayList<Integer> dataList, int index1, int index2){
    int temp1 = dataList.get(index1);
    int temp2 = dataList.get(index2);
    dataList.set(index1, temp2);
    dataList.set(index2, temp1);
  }

  /**
  Parameters:
  - dataList - an ArrayList of Integers
  - valueToRemove - the value to remove
  Postconditions:
  - The dataList is modified such that all occurances of valueToRemove are removed.
  */
  public static void removeValue(ArrayList<Integer> dataList, int valueToRemove){
    // Method 1:
    for (int i = 0; i<dataList.size(); i++){
      int temp = dataList.get(i);
      if (temp == valueToRemove){
        dataList.remove(i);
        i--;
      }
    }
    
    // Method 2:
    // count how many times the value shows up
    // int count = 0;
    // for (int i = 0; i<dataList.size(); i++){
    //   if (dataList.get(i) == valueToRemove){
    //     count ++;
    //   }
    // }
    // // remove "count" amount of times
    // for (int i = 0; i<count; i++){
    //   dataList.remove(new Integer(valueToRemove));
    // }
    
  }


  /**
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Preconditions:
  - ListA and ListB have equal lengths.
  Returns:
  - A new ArrayList that contains the sum of the corresponding indecies of the two arraylists.
    e.g. sumLists( [1,2,3], [4,0,5]) would return: [5,2,8]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> sumLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> sum = new ArrayList<Integer>(ListA.size());
    int tempC = 0;
    for (int i=0; i<ListA.size(); i++){
      int tempA = ListA.get(i);
      int tempB = ListB.get(i);
      tempC = tempA + tempB;
      sum.add(tempC);
    }
    return sum;
  }

  /** zipLists
  Parameters:
  - ListA,ListB - ArrayLists of integer values.
  Returns:
  - A new ArrayList that contains all of the elements from both ArrayLists in alternating order starting with ListA's first element.
    When one list has no more values to add, continue adding the remaining values of the longer list.
    e.g. zipLists( [1,2,3,4], [8,9]) would return: [1,8,2,9,3,4]
  Postconditions:
  - The parameter ArrayLists should not be modified.
  */
  public static ArrayList<Integer> zipLists(ArrayList<Integer>ListA,ArrayList<Integer>ListB){
    ArrayList<Integer> zip = new ArrayList<Integer>(ListA.size() + ListB.size());
    for (int i = 0; i<ListA.size() + ListB.size(); i++){
      int tempA = ListA.get(i);
      int tempB = ListB.get(i);
      
    }
    System.out.println("The size of zip is " + ListA.size());
    System.out.println("The size of zip is " + ListB.size());
    System.out.println("The size of zip is " + zip.size());
    return null;
  }




  public static void main(String[] args) {

    ArrayList<Integer> al;

    // Uncomment these to test buildRandomList
    System.out.println("BUILD RANDOM LIST: ");
    al = buildRandomList(10,10);
    System.out.println(al);
    int sum = sumOfList(al);
    System.out.println("SUM: " + sum);

    System.out.println("");
    System.out.println("SWAP ELEMENTS:");
    // Uncomment these to test swapElements
    swapElements(al, 2,6);
    System.out.println(al);

    System.out.println("");
    System.out.println("REMOVE VALUE:");
    // Uncomment these to test removeValue
    al.add(5);
    al.add(10);
    al.add(5);
    al.add(13);
    al.set(2,5);
    al.set(3,5);
    System.out.println(al);
    removeValue(al,5); 
    System.out.println(al);

    System.out.println("");
    System.out.println("SUM LISTS:");
    // test sumLists
    ArrayList<Integer> A = buildRandomList(5, 6);
    ArrayList<Integer> B = buildRandomList(5, 6);
    System.out.println("A: " + A);
    System.out.println("B: " + B);
    System.out.println("C: " + sumLists(A, B));

    System.out.println("");
    System.out.println("ZIP LISTS:");
    // test zipLists
    zipLists(A, B);
  }

}