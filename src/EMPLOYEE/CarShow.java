package EMPLOYEE;

public class CarShow {

	public static void main(String[] args) {
		
		Car car1=new Car();
		Car car2=new Car("BMW","X8",2019);
		Car car3=new Car("AUDI","Q8",2016,"Black",65000);
		Car car4=new Car("BMW","X8",2019,"White",45000);
		Car car5=new Car("Mercedes","X500",2020);
		car5.setPrice(100000);
		
		Car[] allCars= {car1,car2,car3,car4,car5};
		for(Car car :allCars) {
			car.display();
		}

	}

}
