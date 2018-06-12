package EMPLOYEE;

public class employee {
	
	private String name;
	private long employeeid;
	private double salary;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	public long getemployeeid() {
		return employeeid;
	}
	public void setemployeeid(long employeeid) {
		this.employeeid=employeeid;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	public String tostring() {
		return "Employee[name="+name+",employeeid= "+employeeid+",salary= "+salary+"]";
	}

}
