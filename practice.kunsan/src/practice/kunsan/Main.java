package practice.kunsan;

import java.util.Scanner;

public class Main {

      public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           float celsius, fahrenheit;
           System.out.print("Enter temperature in Celsius: ");

           celsius = sc.nextFloat();
           fahrenheit = 32 + (celsius * 9 / 5);
           System.out.println(celsius +" ¨¬C is equal to " + fahrenheit + " ¨¬F");                                  
     }
}