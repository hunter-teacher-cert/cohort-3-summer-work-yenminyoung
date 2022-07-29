import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    /* STACK STACK STACK STACK STACK STACK STACK STACK STACK STACK */
    System.out.println("\n ----- STACK ----- ");
	  Stack s = new Stack();
    Random r = new Random();
    int bigness = 20;

    // Create a stack
    for (int i = 0; i<bigness; i++){
      s.push(r.nextInt(20));
    }

    // Uncomment these if you want to delete everything
    // for (int i = 0; i<bigness; i++){
    //   s.pop();
    // }

    System.out.println(s);

    System.out.println("The top value is: " + s.top());
    System.out.println("Is the stack empty? " + s.isEmpty());
    System.out.println("How big is the stack? " + s.size());

    /* QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE QUEUE */
    System.out.println("\n ----- QUEUE ----- ");
	  Queue q = new Queue();
    int queueBigness = 20;
    for (int i = 0; i<queueBigness; i++){
      q.enqueue(r.nextInt(20));
    }
    // for (int i = 0; i<queueBigness; i++){
    //   q.dequeue();
    // }
    System.out.println(q);
    System.out.println("Is the queue empty? " + q.isEmpty());
    System.out.println("How big is the queue? " + q.size());
  }
}