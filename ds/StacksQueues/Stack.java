import java.io.*;
import java.util.*;

public class Stack{

  // Place private instance variables here
  private ArrayList<Integer> s;
  private int peakIndex;

  // Place constructors here
  public Stack(){
    s = new ArrayList<Integer>();
    peakIndex = 0;
  }

  // print out arrayList
  public String toString(){
    return s.toString();
  }

  // add value to the top of the stack
  public void push(int value){
    s.add(peakIndex, value);
    peakIndex ++;
  }

  // remove and return top value from the stack that you just deleted
  public int pop(){
    if (isEmpty() == false){
      int pimpleBeGone = s.get(peakIndex-1);
      s.remove(peakIndex-1);
      peakIndex --;
      return pimpleBeGone;
    } else {
      return -1;
    }
  }

  // return but do not remove the top value from the stack
  public int top(){
    if (isEmpty() == false){
      int pimpleBeGone = s.get(peakIndex-1);
      return pimpleBeGone;
    } else {
      return -1;
    }
  }

  // returns true if the stack is empty, false otherwise
  public boolean isEmpty(){
    return peakIndex==0;
  }

  // return the number of elements currently in the stack
  public int size(){
    return peakIndex;
  }

  // returns true if the stack if full, false otherwise (only implement this for arrays)
  public boolean isFull(){
    return true;
  }

}