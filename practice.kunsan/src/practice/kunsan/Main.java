package practice.kunsan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        float average;
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter all the numbered grades of students: ");
        for(int i = 0; i < 10 ; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
        average = (float)sum / 10;
        System.out.println("Average:"+average);
    }
}