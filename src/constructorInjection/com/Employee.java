package constructorInjection.com;

public class Employee {
	int id;
	String name;
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Employee(int id) {
		this.id = id;
	}
	public Employee(String name) {
		this.name = name;
	}
	
	public Employee() {
		System.out.println("Default Constructor");
	}
	public void display() {
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
	}
}
