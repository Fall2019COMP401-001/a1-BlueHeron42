package a1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class A1Adept{

	public static void main(String[] args) {
		DecimalFormat dec = new DecimalFormat(".00");
		Scanner scan = new Scanner(System.in);
		int numberOfItems = scan.nextInt();
		String itemNames [] = new String[numberOfItems];
		double itemPrices [] = new double[numberOfItems];
		for (int i = 0; i < numberOfItems; i++) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		int customerCount = scan.nextInt();
		String customerNames [] = new String[customerCount * 2];
		double customerCosts [] = new double[customerCount];
		for (int i = 0; i < customerCount; i++) {
			double customerTotal = 0.0;
			customerNames[2*i] = scan.next();
			customerNames[(2*i)+1] = scan.next();
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
		String biggestName;
		int o = 0;
		for(o = 0; o<customerCount; o++) {
			if(customerCosts[o] > biggest) {
				biggest = customerCosts[o];
			}
		}
		
		System.out.println("Biggest: "+ customerNames[2*(o-1)] + " " + customerNames[2*(o-1)+1] + " (" + dec.format(biggest) + ")");

		double smallest = customerCosts[0];
		int l = 0;
		for(l = 1; l < customerCount; l++) {
			if(customerCosts[l] < smallest) {
				smallest = customerCosts[l];
			}
		}
		System.out.println("Smallest: "+ customerNames[2*(l-1)] + " " + customerNames[2*(l-1)+1] + " (" + dec.format(smallest) + ")");

		double totalCost= 0;
		for(int a = 0; a < customerCount; a++) {
			totalCost += customerCosts[a];
		}
		//System.out.println(totalCost);
		double average = totalCost/customerCount;
		System.out.println("Average: " + dec.format(average));
	}

}
