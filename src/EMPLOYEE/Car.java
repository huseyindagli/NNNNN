package EMPLOYEE;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private String color;
	private double price;
	
	public Car() {
		System.out.println("no arg constructor");
	}
	public Car(String make ,String model,int year) {
		this.make=make;
		this.model=model;
		this.year=year;
		System.out.println("3 args constructor");
		
	}
	public Car(String make ,String model,int year,String color,double price) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.color=color;
		this.price=price;
		System.out.println("5 args constructor");
		
	}
	
		
	
	public void display() {
		System.out.println(make+" "+model+" "+year+" "+color+" "+price);
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public String getColor() {
		return color;
	}
	
	

}
