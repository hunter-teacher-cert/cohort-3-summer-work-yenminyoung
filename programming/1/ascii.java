import java.io.*;
import java.util.*;
import java.util.Random;

public class ascii{

  String name = new String ("yenmin");
  String NAME = new String("");
  int n;
  int N;
  

  for (int i=0; i<name.length(); i++){
    n = (int)name.charAt(i);
    N = n - 32;
  NAME = NAME + (char)N;
    
  }
System.out.println(NAME);
}

// A - Z
// 65 - 90

// a - z
// 97 - 122
