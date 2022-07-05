import java.io.*;
import java.util.*;

public class Time {
  public static void main(String[] args){
    // Part 1: Calculate seconds since midnight
    int hour, minute, second;
    double totalSeconds;
    hour = 21;
    minute = 4;
    second = 32;
    totalSeconds = ((hour*60)+minute)*60 + second;
    System.out.println("Since midnight, " + totalSeconds + " seconds has passed.");

    // Part 2: Calculate seconds remaining in the day
    double totalSecInADay, secRemaining;
    totalSecInADay = 24*60*60;
    secRemaining = totalSecInADay - totalSeconds;
    System.out.println(secRemaining + " seconds remain today.");

    // Part 3: Calculate percentage of the day that has passed
    double percentPassed;
    percentPassed = totalSeconds/totalSecInADay;
    System.out.println(percentPassed + " percent of the day is gone.");

    // Part 4: Calculate how much time it took to do this program
    double totalSeconds2, secondsElapsed;
    hour = 21;
    minute = 12;
    second = 43;
    totalSeconds2 = ((hour*60)+minute)*60 + second;
    secondsElapsed = totalSeconds2 - totalSeconds;
    System.out.println("You spent " + secondsElapsed + " seconds working on this program.");
  }
}