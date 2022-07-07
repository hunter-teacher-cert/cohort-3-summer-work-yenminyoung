/**
 * Recursive String Reverser by Team Palindromotosis
 * Yenmin Young
 * collaborators: First Last, First Last
 */


public class Reverser
{
  /**
     String reverseF(String) -- recursive String reverser
     precond:  input String is non-empty
     postcond: returns input String with chars in reverse order
  */
  public static String reverseR( String s )
  {
    /* YOUR SIMPLE, SMART IMPLEMENTATION HERE */
    // String blah = new String(s);
    // return s.charAt(s.length());
    // return s.charAt(0);
    String blah = "";
    // char temp = s.charAt(0);
    // return Character.toString(temp);

    // start with the s.charAt(s.length()-0)
    // then add s.charAt(s.length()-1)
    // then add s.charAt(s.length()-2)
    // repeat until s.length()-x = 0
    // aka when x == s.length()
    for (int i=0; i<s.length(); i++){
      blah = blah + s.charAt(s.length()-1-i);
    }
    
    
    // else {
      // blah = blah + s.charAt(s.length()-n)
    // }
    return blah;
  }


  public static void main( String[] args )
  {
    String a = "a";
    char b = 'b';
    String c = a + b;
    System.out.println(c);
    System.out.println( reverseR("odd") ); // --> ddo
    System.out.println( reverseR("even") ); // --> neve
    System.out.println( reverseR("abcdefg") ); // --> gfedcba
    System.out.println( reverseR("stressed") ); // --> desserts
    System.out.println( reverseR("amanaplanacanalPanama") ); // --> amanaPlanacanalpanama

    // more tests welcome
    // got some good palindromes?
  }
}