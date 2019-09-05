package a1;

import java.util.Scanner;

public class A1Jedi {

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
		int[] itemsBought = new int[numberOfItems];
		int[] customersBought = new int[numberOfItems];
		
		for (int i = 0; i < customerCount; i++) {
			customerNames[i] = scan.next();
			customerNames[i] += " "+ scan.next();
			int itemCount = scan.nextInt();
			String[] checkRepeatItems = new String[itemCount];
			
			for (int j = 0; j < itemCount; j++) {
				
				int countOfEachItem = scan.nextInt();
				String item = scan.next();

				for (int k = 0; k < countOfEachItem; k++) {					
					for (int r = 0; r < itemNames.length; r++) {
						if (itemNames[r].equals(item)) {
							itemsBought[r]++;
						}
					}
					
				}
				
				if (checkForRepeatItems(checkRepeatItems, item) == true) {
						for (int p = 0; p < itemNames.length; p++) {
							if (itemNames[p].equals(item)) {
								customersBought[p]++;
							}
						}
				}
			
				checkRepeatItems[j] = item;
				
			}
			
		}
		
		for (int i = 0; i < itemNames.length; i++) {
			if (customersBought[i] == 0) {
				System.out.println("No customers bought " + itemNames[i]);
			} else {
				System.out.println(customersBought[i] + " customers bought " + itemsBought[i] + " " + itemNames[i]);
			}
		}
				
	}
	public static boolean checkForRepeatItems(String[] items, String itemName) {
		for (int i = 0; i < items.length; i++) {
			if (items[i] == null) {
				return true;
			}
			if (items[i].equals(itemName)) {
				return false;
			}
		}
		return true;
	}
}
