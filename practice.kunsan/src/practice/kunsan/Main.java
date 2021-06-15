package practice.kunsan;

public class Main {

	public static void main(String[] args) {
		String[] arrNames = { "Hana", "Duy", "Sey", "Ney", "Daso" };
		int[][] arrScores = { { 98, 95, 92 }, { 35, 46, 25 }, { 26, 75, 53 }, { 46, 87, 76 }, { 54, 74, 53 } };
		short[] sum = new short[5];
		float[] average = new float[5];

		for (int i = 0; i < arrScores.length; i++) { // 5 times
			for (int j = 0; j < arrScores[1].length; j++) { // 3 times
				sum[i] += arrScores[i][j];
				average[i] = (float) sum[i] / arrScores[1].length;
			}
			System.out.println(arrNames[i]);
			// System.out.println(arrScores[i][j]); : to print every single scores of them
			System.out.println("Sum: " + sum[i]);
			System.out.printf("Average: " + "%.2f", average[i]);
			System.out.println();
		}
	}
}