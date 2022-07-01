import java.io.*;
import java.util.*;
import java.util.Random;

public class sentence{
  public static void main(String[] args) {

    
  }
}





/*
1. go through each character
2. check to see if it's a space
3. then proceed to pull the next word
4. you'll pull each following character
5. concatenate characters together
6. print word when it hits the next space

String sentence = New String ("Large bulky items on stoopnyc.");
String word = New String("");
int = 0;
while (sentence.charAt(i) != ' '){
i ++;
}
while (sentence.charAt(i) == ' '){
i ++;
}
while (sentence.charAt(i) != ' '){
word = word + sentence.charAt(i)
i ++;
}
System.out.println(word)
*/


// Go through the first word character by character without displaying anything
// Precondition: someString does not begin with spaces. Words are separated by spaces.
// Thus, someString in position 0 is not a space char.
someString = "a dog barks"
int i = 0;
while ( someString . charAt( i ) != ' ')
{
  i++ ;
}
// Postcondition: someString in position i IS a space.
// Go through all the spaces after the first word
while (someString . charAt( i ) == ' ')
{
  i++ ;
}
// Postcondition: someString in position i IS NOT a space.
// Go through the second word character by character and display each character.
// Precondition: someString[ i ] is the first letter of the second word
while (someString [ i ] != ' ') // This only works for sentences of three words or more. Try to fix it!
{
                 System.out.print( someString.charAt ( i ) );
  i++ ;
}

