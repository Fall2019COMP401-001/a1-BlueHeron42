package a1;

import java.util.Scanner;

public class A1Novice {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int customerCount = sc.nextInt();
		String [] firstNames = new String[customerCount];
		String [] lastNames = new String[customerCount];
		double [] customerTotals = new double[customerCount];
		for(int i = 0; i < customerCount; i++) {
			firstNames[i] = sc.next();
			lastNames[i] = sc.next();
			int quantityBought = sc.nextInt();
			for(int a = 0; a < quantityBought; a++) {
				int numberBought = sc.nextInt();
				String item = sc.next();
				double price = sc.nextDouble();
				customerTotals[i] += price * numberBought;
			}
			System.out.println(firstNames[i].charAt(0)+". "+ lastNames[i]+": "+ String.format("%.2f",  customerTotals[i]));
		}
		
	}
}
