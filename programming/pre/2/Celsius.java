import java.io.*;
import java.util.*;

public class Celsius {
  public static void main(String[] args){
    double fah, cel, fah2, cel2;
    Scanner in = new Scanner(System.in);

    System.out.print("Input temperature in Fahrenheit: ");
    fah = in.nextInt();
    cel = (fah-32.0)*5.0/9.0;
    System.out.printf("%.1f F = %.1f C \n", fah, cel);

    System.out.print("Input temperature in Celsius: ");
    cel2 = in.nextInt();
    fah2 = cel2*9.0/5.0 + 32.0;
    System.out.printf("%.1f C = %.1f F \n", cel2, fah2);
  }
}