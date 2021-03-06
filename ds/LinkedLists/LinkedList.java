import java.io.*;
import java.util.*;

/**
For all attempted methods, make sensible decisions for error and
edge cases (such as indexing out of bounds).

Basic
-----
add(string value)
get(int index);
toString()


Intermediate (at least add, size + one of the other two)
------------
size()
add(int index,String value)
indexOf(String value);
toArray()


Challenge
--------
remove(int index);
*/

public class LinkedList{

  private Node head;
  private int sizeLL;

  public LinkedList(){
    head = null;
    sizeLL = 0;
  }

  /**
  Parameters:
  value - the new string to add to the list

  Adds a new node containing value to the front of the list.
  */
  public void add(String value){
    Node n1 = new Node(value, head);
    head = n1;
    sizeLL ++;
  }

  /**
  Returns the String in the node at location index.
  */
  public String get(int index){
    Node walker = new Node();
    walker = head;
    for (int i = 0; i<index; i++){
      walker = walker.getNext();
    }
    return walker.getData();
  }

  /**
  Return a string representation of the list
  */
  public String toString(){
    // Method 1
    String sentence = "";
    Node walker = new Node();
    walker = head;
    while (walker.getNext() != null){
      sentence += walker.getData() + " --> ";
      walker = walker.getNext();
    }
    sentence += walker.getData();
    return sentence;

    // Method 2
    // Use the get method?
  }

  /**
  returns the number of elements in the list
  */
  public int size(){
    // int counter = 0;
    // Node walker = head;
    // while (walker != null){
    //   counter ++;
    //   walker = walker.getNext();
    // }
    // return counter;
    return sizeLL;
  }



  /**
  Parameters:
  index - an int with the location to add
  value - the new value

  Adds a new node with the String value to the list.
  The new node should be added at the location specified by the index.

  For example, given the list:
  "a" -> "b" -> "c" -> "d"

  add(1,"z") results in:
  "a"-> "z" -> "b" -> "c" -> "d"

  */
  public void add(int index, String value){
    // If you want to insert it at the beginning, then setNext to the head
    if (index == 0){
      add(value);
    } else { // Otherwise, first walk to the index
      // METHOD 1 UGLY
      // Node walker = new Node();
      // walker = head;
      // for (int i = 0; i<index; i++){
      //   walker = walker.getNext();
      // }
      // Node n = new Node(value, walker); // Create a new node and point to that index
      // walker = head; // Make a walker again
      // for (int i = 0; i<index-1; i++){
      //   walker = walker.getNext();
      // }
      // walker.setNext(n); // Set the node prior to the index point to the new node

      // METHOD 2 PRETTY
      Node walker1 = head;
      for (int i = 0; i<index-1; i++){
        walker1 = walker1.getNext();
      }
      Node walker2 = walker1.getNext();
      Node n = new Node(value, walker2);
      walker1.setNext(n);
      sizeLL ++;
    }
    
    
  }


  /**
  Returns the index (location) of the first node in the list
  that contains value.

  Example:
  Given the list:
  "a"->"b"->"c"->"d"->"e"
  indexOf("d") would return 3 since "d" is at location 3.

  */
  public int indexOf(String value){
    // Node walker = head;
    // for (int i = 0; i<sizeLL; i++){
    //   if (walker.getData() == value){
    //     return i;
    //   } else {
    //     walker = walker.getNext();
    //   }
    // } 
    return -1;
  }


  /**
  This routine should create a new array that is the same
  size as the number of Nodes in the list.
  It should then copy all of the values to the array and return the array.
  */
  public String[] toArray(){
    // count the size
  // int size = 0;
  //   Node walker = new Node();
  //   walker = head;
  //   while (walker.getNext() != null){
  //     size ++;
  //     walker = walker.getNext();
  //   }
  //   size ++;
    // Don't need to count the size since we already counted and stored it as sizeLL

    // Create an array of the same size as the Linked List
    String[] a = new String[sizeLL];

    // Walk through the Linked List and set its value to the array
    Node walker = head;
    for (int i = 0; i < sizeLL; i++){
      a[i] = walker.getData();
      walker = walker.getNext();
    }
    return a;
  }



  /**
  Remove the Node at location index from the list.

  Ex:
  
  Given the list:
  "a"->"b"->"c"->"d"->"e"

  remove(2) results in:
  "a"->"b"->"d"->"e"
  */
  public void remove(int index){
    if (index == 0){
      head = head.getNext();
    } else {
      // Walker 1 goes to the node prior
      // Walker 2 goes to the node
      Node walker1 = head;
      for (int i = 0; i<index-1; i++){
        walker1 = walker1.getNext();
      }
      Node walker2 = walker1.getNext();
  
      // setNext for walker 1 to the node after
      // setNext for walker 2 to null
      walker1.setNext(walker2.getNext());
      walker2.setNext(null);
      sizeLL --;
    }
    
  }
}

