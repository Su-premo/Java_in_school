package practice.kunsan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbered grade you received: ");
		int score = input.nextInt();

		if (score >= 90) {
			System.out.println("your grade is A.");
		} else if (score >= 80 && score < 90)
			System.out.println("your grade is B.");
		else if (score >= 70 && score < 80)
			System.out.println("your grade is C.");
		else if (score >= 60 && score < 70)
			System.out.println("your grade is D.");
		else if (score < 60)
			System.out.println("your grade is F.");
	}
}