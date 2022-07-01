import java.io.*;
import java.util.*;

// public class friends{
//   public static void main(String[] args) {

//     Scanner input = new Scanner(System.in);

//     System.out.print("How many close friends do you have?");
//     int n = input.nextInt();

//     input.nextLine();  // clear newline
//     String myFriends[] = new String[n];

//     for (int i=0; i<myFriends.length; i++){
//       System.out.print("Enter a name of one of your friends: ");
//       myFriends[i] = input.nextLine();
      
//     }
//     for (int i = 0; i<myFriends.length; i++){
//       System.out.println(myFriends[i]);
//     }

    
//   }
// }

public class friends{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String myFriends[] = new String[1000];
    int numOfFriends = 0;
    String aFriend = "";

    while (! aFriend.equals("Stop")){
      System.out.print()
    }

    for (int i=0; i<myFriends.length; i++){
      System.out.print("Enter a name of one of your friends: ");
      myFriends[i] = input.nextLine();
      numOfFriends ++;
      
    }
    for (int i = 0; i<myFriends.length; i++){
      System.out.println(myFriends[i]);
    }

    
  }
}