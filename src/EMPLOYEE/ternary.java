package EMPLOYEE;

import java.util.Scanner;

public class ternary {

	public static void main(String[] args) {
		int drinktype;
		int drink;
		double price=0.0;
		String drinkselection = null;

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a drink type(1-Hot;2-Cold):");
		drinktype= sc.nextInt();
		
		System.out.println("Select your drink(1-tea;2-coffee):");
		drink=sc.nextInt();
		
		switch(drinktype) {
		
		
		case 1:
			switch(drink) {
		case 1:
				drinkselection="tea";
				price=2.0;
				break;
		case 2:
			drinkselection="coffee";
			price=4.0;
			break;
		default:
			System.out.println("Invalid selection");
			break;
			}
			break;
		
		case 2:
			switch(drink) {
			case 1:
				drinkselection="iced tea";
				price=3.2;
				break;
			case 2 :
				drinkselection="lemonade";
				price=3.4;
				break;
			default:
				System.out.println("Invalid selection");
				break;
			}
			break;
		default:
			System.out.println("Invalid selection");
			break;
		}
		System.out.println("Your selection is "+drinkselection+".The price is $"+price+"Enjoy!!!");
	}
}


