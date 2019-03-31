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

		Store store = null;

		switch (type){
			case 1:
				store = new GameStore();
				break;
			case 2:
				store = new FoodStore();
				break;
			case 3:
				store = new BookStore();
				break;
		}

		System.out.println("Store " + store);
		if (store == null){
			System.out.println("Store Type Not Found");
			return;
		}

		store.setName(name);

		System.out.println("-----------------------------------");
		System.out.println("The " + store.getName() + " Was Created");


	}
}
