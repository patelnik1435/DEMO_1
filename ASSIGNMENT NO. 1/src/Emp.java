
class A {
	String name;
	int id;
	double sal;
	String address;
	public A(String name, int id, double sal, String address) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.address = address;
	}
	@Override
	public String toString() {
		return "A [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

	
}

public class Emp {
	public static void main(String[] args) {
		A a = new A("niks", 02, 12000, "kandibvali");
		System.out.println(a);
		

	}
}
