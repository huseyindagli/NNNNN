package EMPLOYEE;

public class employeetester {

	public static void main(String[] args) {
		
		employee e1=new employee();
		e1.setname("Hakan");
		e1.setemployeeid(123456);
		e1.setsalary(6.756);
		
		employee e2 =new employee();
		e2.setname("Mustafa");
		e2.setemployeeid(312456);
		e2.setsalary(4.544);
		
		System.out.println(e1.tostring());
		System.out.println(e2.tostring());
		

	}

}
