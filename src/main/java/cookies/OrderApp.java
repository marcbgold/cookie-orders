package cookies;

import java.util.Scanner;

public class OrderApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String choice = "";
		String variety = "";
		int quantity;

		MasterOrder orderList = new MasterOrder();

		do {
			System.out.println();
			System.out.println("Girl Scout Cookie Ordering System");
			System.out.println("What would you like to do?");
			System.out.println();
			System.out.println("1. Add cookies to order");
			System.out.println("2. Remove cookies from order");
			System.out.println("3. View current order");
			System.out.println("4. Quit");
			choice = input.next().trim();
			System.out.println();

			switch (choice) {
			case "1":
				do {
					System.out.println("What kind of cookeis would you like to order?");
					System.out.println();
					System.out.println("1. S'mores");
					System.out.println("2. Thin Mints");
					System.out.println("3. Samoas");
					System.out.println("4. Tagalongs");
					System.out.println("5. Trefoils");
					System.out.println("6. Do-si-dos");
					System.out.println("7. Lemonades");
					System.out.println("8. Savannah Smiles");
					System.out.println("9. Thanks-A-Lots");
					System.out.println("10. Toffee-tastics");
					System.out.println("11. Trios");
					System.out.println("12. Never mind, go back to the main menu");
					choice = input.next().trim();
					System.out.println();

					switch (choice) {
					case "1":
						variety = "S'mores";
						break;
					case "2":
						variety = "Thin Mints";
						break;
					case "3":
						variety = "Samoas";
						break;
					case "4":
						variety = "Tagalongs";
						break;
					case "5":
						variety = "Trefoils";
						break;
					case "6":
						variety = "Do-si-dos";
						break;
					case "7":
						variety = "Lemonades";
						break;
					case "8":
						variety = "Savannah Smiles";
						break;
					case "9":
						variety = "Thanks-A-Lots";
						break;
					case "10":
						variety = "Toffee-tastics";
						break;
					case "11":
						variety = "Trios";
						break;
					case "12":
						break;
					default:
						continue;
					}
					break;
				} while (true);

				if (choice.equals("12")) {
					continue;
				}

				System.out.println();
				System.out.println("How many boxes of " + variety + " would you like to order?");
				quantity = input.nextInt();
				orderList.addOrder(new CookieOrder(variety, quantity));
				System.out.println();
				System.out.println(quantity + " boxes of " + variety + " have been added to your order.");
				break;
			case "2":
			case "3":
			case "4":
				break;
			default:
				continue;
			}

		} while (!choice.equals("4"));

		System.out.println();
		System.out.println("Thank you. Goodbye.");

		// orderList.addOrder(new CookieOrder("Tagalongs", 1));
		// orderList.addOrder(new CookieOrder("Thin Mints", 2));
		//
		// orderList.showOrder();
		// System.out.println();
		//
		// orderList.removeVariety("Tagalongs");
		// orderList.showOrder();

		input.close();
	}

}
