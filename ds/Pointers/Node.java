public class Node{
  private String data;
  private Node next;


  /* Constructors */

  public Node(){

  }

  public Node(String data){
    this.data = data;
    this.next = null;

  }


  public Node(String data, Node next){
    this.data = data;
    this.next = next;
  }

  public String getData(){
    return data;
  }
  public Node getNext(){
    return next;
  }

  public void setData(String data){
    this.data = data;
  }

  public void setNext(Node next){
    this.next = next;
  }

  public String toString(){
    return "" + data + "->";
  }
}


Node n1 = new Node(5);
Node n2 = new Node(10);
Node n4 = new Node(0, n2);
Node n5 = new Node(30);
n1.setNext(n2);
// n2.setNext(new Node(15));
// change the above line of code into:
n2.setNext(n4);
n4.setNext(new Node(15));

n2 = new Node(20);
Node n3 = new Node(25,n2);



  


Create a new Node variable set it to point to the node with the 10 in it.
Create a new Node variable and instantiate it to a new Node with a value of 30.
Write the code to insert this new Node between the 10 and the 15