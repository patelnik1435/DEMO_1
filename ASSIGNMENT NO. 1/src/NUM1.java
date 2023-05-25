class Business {
	String name = "shyam";
	String work = "factory";
	static double sal = 150000;
	static double revenue = 1000000;

	void display_Info() {
		System.out.println("name");
		System.out.println("work");
	}

	static void display_info3() {
		System.out.println(sal);
		System.out.println(revenue);
	}
}

public class NUM1 {
	public static void main(String[] args) {
		Business b = new Business();
		Business.display_info3();
		b.display_Info();
		
	}
}
