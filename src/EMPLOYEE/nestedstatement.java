package EMPLOYEE;

import java.util.Scanner;

public class nestedstatement {

	public static void main(String[] args) {
		int drinktype;
		int drink;
		double price=0.0;
		String typedrink = null;

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a drink type(1-Hot;2-Cold):");
		drinktype= sc.nextInt();


		if(drinktype==1) {
			System.out.println("Select your drink(1-tea;2-coffee):");
			drink=sc.nextInt();
			if(drink==1) {
				typedrink="tea";
				price=2.0;
			}else if(drink==2) {
				typedrink="coffee";
				price=4.0;
			}else {
				System.out.println("Invalid selection");
			}

		}

		else if(drinktype==2) {
			System.out.println("Select your drink(1-iced tea;2-lemonade):");
			drink=sc.nextInt();
			if(drink==1) {
				typedrink="iced tea";
				price=3.2;
			}else if(drink==2) {
				typedrink="lemonade";
				price=3.5;
			}else {
				System.out.println("Invalid selection");
			}

		}
		else {
			System.out.println("Invalid selection");
		}

		System.out.println("your selection is "+typedrink+".The price is $"+price+"Enjoy!!!!!");
	}

}
