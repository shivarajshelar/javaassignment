class Person{
	Person(int a){
		System.out.println("Person(int)");
	}
	
	Person(int a, int b){
		System.out.println("Person(int,int)");
	}
	
	Person(int a, int b, int c, int d){
		System.out.println("Person(int,int, int, int)");
	}
	
}
class Person2{
	
}
class ConstructorDemo2{
	public static void main(String[] args){
		Person p1 = new Person(10);
		Person p2 = new Person(10,20);
		//Person p3 = new Person();
		Person2 p4 = new Person2();
	}
}