// STUDENT-PROMPT: What type of structure do we expect to return? A string, a boolean, or an int?
// PROVIDE: Our goal is to write a method that will tell us the location in the array of the first time a specific number shows up in an array.
// MUST-ANSWER Q: What CS tool can we use to search through an array? How do we check if the value is in the array? ANSWER: for loop; conditional
// BIG IDEA: You can use loops to find specific elements in an arraylist. int foundIndex is a variable that only exists in this method. int foundIndex is a variable that can be used like a signal, not for math.



  public int linearSearch(int value, ArrayList<Integer> data) { // PROVIDE //Names method and assigns parameters. No void statement means we need to return an int.

    int foundIndex = -1; //assigns value (in this case '-1') to variable foundIndex. Take note!! camelCase!!! 
                          // PROVIDE. STUDENT-PROMPT: Why do we need this variable? What does it mean if it returns -1?
    
    for (int i=0; i < data.size(); i++) { //A for loop that starts an index at 0, gives boolean conditions to check, and then increases count. Stops loops when condition is false.

      int element = data.get(i); 

      if (element == value) { //Once the value is found it stops the loop and returns the index that contains the value
        foundIndex = i;      
        break;               // STUDENT-PROMPT: If we found the value, how do we get it to stop so it doesn't keep searching?
        }
      }
    return foundIndex;     // PROVIDE. STUDENT-PROMPT: what will return when we run this method?
  } // end of linearSearch method // PROVIDE


/*
PROVIDE :: code snippets or comments you definitely want to provide
STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
BEEG REVEAL :: this is gonna blow yer minds...
DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc.
FIRSTDRAFT :: code that will work for now, but which you intend to replace later
REVISION vX :: better versions of firstdraft code...
  */