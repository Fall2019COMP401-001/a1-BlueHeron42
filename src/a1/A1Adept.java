package a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1Adept{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int numberOfItems = scan.nextInt();
		String itemNames [] = new String[numberOfItems];
		double itemPrices [] = new double[numberOfItems];
		
		for (int i = 0; i < numberOfItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		int customerCount = scan.nextInt();
		String customerNames [] = new String[customerCount];
		double customerCosts [] = new double[customerCount];
		for (int i = 0; i < customerCount; i++) {
			double customerTotal = 0.0;
			customerNames[i] = scan.next();
			customerNames[i] += " "+ scan.next();
			int itemCount = scan.nextInt();
			for (int j = 0; j < itemCount; j++) {
				int countOfEachItem = scan.nextInt();
				//System.out.println(countOfEachItem);
				String item = scan.next();
				for (int k = 0; k < numberOfItems; k++) {
					if(item.equals(itemNames[k])) {
						customerTotal += countOfEachItem * itemPrices[k];
					}
				}
				
			}
			customerCosts[i] = customerTotal;
		}
		double biggest = customerCosts[0];
		int o = 0;
		for(o = 0; o<customerCount; o++) {
			if(customerCosts[o] > biggest) {
				biggest = customerCosts[o];
				break;
			}
		}
		double smallest = customerCosts[0];
		int l = 0;
		for(l = 0; l < customerCount; l++) {
			if(customerCosts[l] < smallest) {
				smallest = customerCosts[l];
				break;
			}
		}
		//System.out.println(l);
		if(customerCount == 1) {
			System.out.println("Biggest: "+ customerNames[0] + " (" + String.format("%.2f", biggest) + ")");
			System.out.println("Smallest: "+ customerNames[0] + " (" + String.format("%.2f", smallest) + ")");
		}
		else if(customerCount != 1) {
			System.out.println("Biggest: "+ customerNames[o] + " (" + String.format("%.2f", biggest) + ")");
			System.out.println("Smallest: "+ customerNames[l] + " (" + String.format("%.2f", smallest) + ")");
			double totalCost= 0;
			for(int a = 0; a < customerCount; a++) {
				totalCost += customerCosts[a];
			}
			//System.out.println(totalCost);
			double average = totalCost/customerCount;
			System.out.println("Average: " + String.format("%.2f", average));
		}
	}

}
