import java.io.*;
import java.util.*;

public class Queue{

  // PRIVATE INSTANCE
  private ArrayList<Integer> q;
  private int length;

  // CONSTRUCTOR
  public Queue() {
    q  = new ArrayList<Integer>();
    length = 0;
  }

  // METHODS
  // toString
  public String toString(){
    return q.toString();
  }
  
  // add value to the end of the queue
  public void enqueue(int value){
    q.add(length, value);
    length ++;
  }

  // remove and return the top value from front of the queue
  public int dequeue(){
    if (!isEmpty()){
      int stub = q.get(0);
      q.remove(0);
      length --;
      return stub;
    } else {
      return -1;
    }
  }

  // return but do not remove the top value from the front of the queue
  public int front(){
    int stub = q.get(0);
    return stub;
  }

  // returns true if the queue is empty, false otherwise
  public boolean isEmpty(){
    return length==0;
  }

  // returns the number of elements currently in the queue
  public int size(){
    return length;
  }

  // returns true if the queue is full, false otherwise (only implement for array)
  public boolean isFull(){
    return true;
  }
}