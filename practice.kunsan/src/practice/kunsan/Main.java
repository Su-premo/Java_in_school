package practice.kunsan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int line;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print: ");
		line = input.nextInt();
		
		for (int i = 0; i<line; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}