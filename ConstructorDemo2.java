class Employee{
	int employeeId;
	String employeeName;
	double salary;
	String gender;
	String company;
	
	final int a = 100;
	final int b;
	final int c;
	//final int d;
	{
		b = 100;
		company = "Google";
		System.out.println("init block invoked!!");
	}
	Employee(int eid, String name, double sal, String gen){
		System.out.println("Constructor invoked!!");
		employeeId = eid;
		employeeName = name;
		salary = sal;
		gender = gen;
		
		c = 200;
	}
	
}
class ConstructorDemo{
	public static void main(String[] args){
		Employee e1 = new Employee(1,"A",10000.0,"Female");
		
		Employee e2 = new Employee(2,"B",20000.0,"Male");
		
		Employee e3 = new Employee(3,"C",30000.0, "Female");
		
		System.out.println(e1.employeeId+" "+e1.employeeName+" "+e1.salary+" "+e1.gender);
		System.out.println(e2.employeeId+" "+e2.employeeName+" "+e2.salary+" "+e2.gender);
		System.out.println(e3.employeeId+" "+e3.employeeName+" "+e3.salary+" "+e3.gender);
		
	}
}