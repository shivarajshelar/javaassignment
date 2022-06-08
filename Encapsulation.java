class EncapsulationDemo{
	public static void main(String[] args){
		Employee e1 = new Employee(1,"A",10000.0,"DEP1");
		//
		System.out.println(e1.getEmployeeId());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		System.out.println(e1.getDepartmentName());
		
		e1.setEmployeeId(1);
		e1.setName("AA");
		e1.setSalary(15000.0);
		e1.setDepartmentName("DEP2");
		
		Employee e2 = new Employee(2,"B",20000.0,"DEP2");
		
		
	}
}