import Stores.*;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Select a type of store to be created");
		System.out.println("1. Game Store");
		System.out.println("2. Food Store");
		System.out.println("3. Book Store");
		Scanner scanner = new Scanner(System.in);
		int type = scanner.nextInt();

		scanner.nextLine();

		System.out.println("-----------------------------------");
		System.out.println("Enter Store Name");
		String name = scanner.nextLine();

		StoreBuilder builder = null;

		switch (type){
			case 1:
				builder = new GameStore();
				break;
			case 2:
				builder = new FoodStore();
				break;
			case 3:
				builder = new BookStore();
				break;
		}


		if (builder == null){
			System.out.println("Store Type Not Found");
			return;
		}


		builder.build();
		builder.setName(name);
		builder.setType();


		System.out.println("-----------------------------------");
		System.out.println("The " + builder.getStore().getName() + "Of Type " + builder.getStore().getType() + " Was Created");

	}
}
