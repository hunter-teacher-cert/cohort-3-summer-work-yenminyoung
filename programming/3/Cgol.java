import java.io.*;
import java.util.*;

/**
 * Conway's Game of Life by Team 14
 * Yenmin Young
 * collaborators: Alicia Wade, Jerusha Theobald
 */

/**
   The Rules of Life:

   Survivals:
   * A living cell with 2 or 3 living neighbours will survive for the next generation.

   Deaths:
   * Each cell with >3 neighbours will die from overpopulation.
   * Every cell with <2 neighbours will die from isolation.

   Births:
   * Each dead cell adjacent to exactly 3 living neighbours is a birth cell. It will come alive next generation.

   NOTA BENE:  All births and deaths occur simultaneously. Together, they constitute a single generation.
*/

public class Cgol
{

  //create, initialize, and return  empty board (all cells dead)
  public static char[][] createNewBoard( int rows, int cols )
  {
    char[][] board = new char [rows][cols];  // create a new 2D array
    for (int i = 0; i<rows; i++){
      for (int j=0; j<cols; j++){
        board[i][j] = '0';                    // set every element to 0
      }
    }
    return board;
  }


  //print the board to the terminal
  public static void printBoard( char[][] board )
  {
    int r = board.length;
    int c = board[0].length;
    for(int i=0; i<r; i++){
      for (int j=0; j<c; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println("");
    }
  }

  // print the board BUT IT'S AN INT
  public static void printBoard2( int[][] board )
  {
    int r = board.length;
    int c = board[0].length;
    for(int i=0; i<r; i++){
      for (int j=0; j<c; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println("");
    }
  }



  //set cell (r,c) to val
  public static void setCell( char[][] board, int r, int c, char val )
  {
    board[r][c] = val;
  }


  //return number of living neigbours of board[r][c]
  public static int countNeighbours( char[][] board, int r, int c )
  {
    // Count the 8 surrounding tiles around board[r][c] to see how many living neighbors it has
      int count = 0;
    // count through the 3x3 tiles
        for (int i = -1; i<=1; i++){
          for (int j = -1; j<=1; j++){
            // exclude the edges
            if (0 <= r+i && r+i < board.length){
              if (0 <= c+j && c+j < board[0].length){
                // don't include the center
                if (i != 0 || j != 0){
                  // check if there's a neighbor
                  if (board[r+i][c+j] == '.'){
                    // count the neighbor
                    count ++;
                  } 
                }
              }
            }
          }
        }    
    return count;
  }


  /**
     precond: given a board and a cell
     postcond: return next generation cell state based on CGOL rules
     (alive 'X', dead ' ')
  */
  public static char getNextGenCell( char[][] board,int r, int c )
  {
    // given board[r][c] check to see the number of neighbors
    // if it is alive AND count < 2 or > 3, then DIE
    // if it is alive AND the count ==2 or ==3, then remain alive
    // if it is dead AND the count is < 3, then stay dead
    // if it is dead AND the count is ==3, then come alive
    char nextGen = board[r][c];                  // initialize a variable to the element of the array
    int count = countNeighbours(board, r, c);     // count the neighbors for this element

    if (board[r][c] == '.'){          // If it's alive
      if (count < 2 || count > 3){    // too lonely or too crowded!
        nextGen = '0';                // DIE
      }
    } else if (board[r][c] == '0'){   // If it's dead
      if (count == 3){                // magical friends
        nextGen = '.';                // ALIVE
      }
    }
    return nextGen;
  }


  //generate and return a new board representing next generation
  public static char[][] generateNextBoard( char[][] board )
  {
    char[][] gen1 = new char [board.length][board[0].length];  // create a new array
    for (int i=0; i<board.length; i++){
      for (int j=0; j<board[i].length; j++){
        gen1[i][j] = getNextGenCell(board, i, j);              // assign the element to the next gen value
      }
    }
    return gen1;
  }


  public static void main( String[] args )
  {
    // initial values and arrays
    int gen = 0;
    int timeline = 10;             // number of generations
    int gridSize = 15;             // size of the grid
    int initialPopulation = 30;    // number of living specimens in Generation 0
    char [][] board = createNewBoard(gridSize, gridSize);    // create the first board
    int [][] neighborArray = new int [gridSize][gridSize];   // create an array for the neighbors
    
    //breathe life into some random cells:
    Random rando = new Random();
    for (int i = 0; i<initialPopulation; i++){
      setCell(board, rando.nextInt(board.length), rando.nextInt(board[0].length), '.');
    }
    
    // Repeat multiple generations
    for (int i=0; i<timeline+1; i++){
      // print out the next generation
      System.out.println("Generation " + gen);
      printBoard(board);
      System.out.println("--------------------------\n\n");
      
      // count the neighbors and figure out the next gen cell
      for (int r = 0; r<board.length; r++){
        for (int c = 0; c<board[r].length; c++){
          char temp = getNextGenCell(board, r, c);
        }
      }

      // Display Neighbors Array
      // System.out.println("Neighbors Array:");
      // printBoard2(neighborArray);
      // System.out.println("--------------------------\n\n");
      
      // create the board of the next gen
      board = generateNextBoard(board);
      gen ++;        // generation count
    }

  }//end main()

}//end class