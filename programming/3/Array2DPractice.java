import java.io.*;
import java.util.*;

/**
 * Array2DPractice by Team 12
 * Yenmin Young
 * Collaborators: Joshua Higgings, Qianhui Vanessa Zou, Joel Bianchi
 */

/**
   INSTRUCTIONS:
   Place this file in a folder named programming/3/.
   This file contains the following completed method. Use it as a model
   to help you with the other methods:
   - buildBoard
   This file also contains stubs (empty methods) for the following
   methods (split into 3 levels):
   Basic level (complete all):
   - printBoard *
   - copyBoard *
   Intermediate level (complete Basic methods plus this method):
   - explodeSquare *
   Advanced level (complete Basic + Intermediate + these two methods):
   - explodeAllChar *
   - downString
   The routines with the * will be particularly helpful for the
   Conway's Game of Life project that you'll work on after this one.
*/


/**
   creates and returns a 2D array of size rowsxcols chars. All elements
   in the 2D array will be set to the char value.
   Ex: buildBoard(3,4,'x') will return this 2D array:
   xxxx
   xxxx
   xxxx
   Use this completed method as an example to help you with some of the
   other methods.
*/

public class Array2DPractice
{
  public static char[][] buildBoard( int rows, int cols, char value )
  {
    char[][] board = new char[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        board[i][j]=value;
      }
    }
    return board;
  }

  /**
     pretty prints a 2D array of characters
     This should print the array as a grid
  */
  public static void printBoard( char[][] board )
  {
    for (int r = 0; r < board.length; r++){
      for (int c = 0; c < board[r].length; c++){
        System.out.print(board[r][c]);
        }
      System.out.println();
    }
    
  }

  /**
     Parameters:
     board - a 2D array of char
     row - the row you want to set
     value - the value to set all the elements in row
     Returns:
     Nothing
     Change the 2D array board so that all the elements in the
     specified row are set to value.
     Ex: Given array:
     xxxx
     xxxx
     xxxx
     xxxx
     setRow(board,2,'@') will change board to
     xxxx
     xxxx
     @@@@
     xxxx
  */
  public static void setRow( char[][] board, int row, char value )
  {
    /* YOUR AWESOME CODE HERE */
  }


  /**
     creates and returns a new 2D array of char the same size as
     original and copies all the elements
  */
  // This only works for non-jagged arrays
  public static char[][] copyBoard( char[][] original )
  {   
    System.out.println("Copying board...");
    char[][] food = new char [original.length][original[0].length];

    for (int r = 0; r < food.length; r++){
      for (int c = 0; c<food[r].length; c++){
        food [r][c] = original[r][c];
      }
    }
    return food;
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     Returns:
     nothing
     A location in a 2D array can be though of as having 8
     neighbors.  In the below 2D array, the neighbors of the element
     marked Q are the numbered elements.
     oooooo
     o123oo
     o4Q5oo
     o678oo
     oooooo
     This method should change all the neighbor cells (elements) to an X
     but not change the element at row,col
     Ex:
     Given the 2D array
     QQQQQ
     QQQQQ
     QQQQQ
     QQQQQ
     explodeSquare(board,1,1) will change the array to
     XXXQQ
     XQXQQ
     XXXQQ
     QQQQQ
     Note: Make sure to correctly handle the cases when you try
     to explode an element on the edges.
  */
  public static void explodeSquare( char[][] board, int row, int col )
  {
    System.out.println("Exploding Square...");
    char temp = board[row][col];
    for (int r = row-1; r <= row + 1; r++){
      for (int c = col-1; c <= col + 1; c++){
        if ( 0 <= r && r < board.length){
          if (0 <= c && c < board[0].length){
            board[r][c] = 'X';
          }
        }
      }
    }
    board[row][col] = temp;
  }

/**
     This method will search through the 2D array board and it will
     explode each square that contains the char c (using the above
     definition of exploding).

     Example:

     Given the array

     qqzqq
     qqqqq
     qqqqq
     qqqqq
     qzqqq
     qqqqq
     qqqqz

     ...
     explodeAllchar(board,'z')
     will change board to

     qXzXq
     qXXXq
     qqqqq
     XXXqq
     XzXqq
     XXXXX
     qqqXz

  */
  public static void explodeAllChar(char[][] board, char d)
  {
    System.out.println("Exploding All the Squares...!!!");

    for (int r = 0; r<board.length; r++){
      for (int c = 0; c<board[r].length; c++){
        if (board[r][c] == d){
          char temp = board[r][c];
          for (int row = -1; row <= 1; row++){
            for (int col = -1; col <= 1; col++){
              if ( 0 <= r + row && r + row < board.length){
                if (0 <= c + col && c + col < board[0].length){
                  if (board[r+row][c+col] == 'a'){
                    board[r + row][c + col] = 'c';
                  }
                }
              }
            }
          }
          board[r][c] = temp;
        }
      }
    }
  }


  /**
     Parameters:
     board - a 2D array of char
     row,col - ints specifying a location in board
     word - a String that you want to insert into the board.
     This will insert the parameter word into board in the downward
     direction. See examples below
     Example:
     Given this array
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     xxxxxx
     downString(board,1,1,"Hello") will change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxxxx
     xOxxxx
     xxxxxx
     Given the above array, downString(board,4,3,"World") will
     change board to:
     xxxxxx
     xHxxxx
     xExxxx
     xLxxxx
     xLxWxx
     xOxOxx
     xxxRxx
     Note that the method has to stop at the bottom of the array.
  */
  public static void downString( char[][] board, int row, int col, String word )
  {
    System.out.println("DOWN STRING:");
    for (int m = 0; m < word.length(); m++){
      if (row + m <= board.length-1){
        System.out.println(row + m);
        board[row+m][col] = word.charAt(m);
      } 
    }
  }


  public static void main( String[] args )
  {
    char[][] b = buildBoard(7,8,'z');
    char[][] a = buildBoard(7,7,'a');
    a[1][1] = 'b';
    a[2][1] = 'b';
    printBoard(b);
    char [][] mood = copyBoard(b);
    printBoard(mood);
    // explodeSquare(b, 4, 4);
    System.out.println("Print out a new board:");
    printBoard(a);
    explodeAllChar(a, 'b');
    printBoard(a);
    System.out.println("FRESH BOARD:");
    printBoard(b);
    downString(b, 0, 3, "horseshoes");
    downString(b, 4, 5, "goodbye");
    printBoard(b);
    /*
      Note, you can directly set elements in the board
      using array notation like b[3][2]='z' and you
      can use array notation to also access individual
      elements
    */
  }
}