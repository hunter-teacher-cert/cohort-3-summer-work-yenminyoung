import java.io.*;
import java.util.*;

public class Date {
  public static void main(String[] args){
    String day, date, month;
    int year;
    day = "Monday";
    date = "4";
    month = "July";
    year = 2022;
    System.out.println("American format:");
    System.out.println(day + ", " + month + " " + date + ", " + year);
    System.out.println("\nEuropean format:");
    System.out.println(day + " " + date + " " + month + " " + year);
  }
}