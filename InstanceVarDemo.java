class A{
	int x;
	int y;
	
}
class InstanceVarDemo{
	int a = 10;
	int b = 20;
	static int c = 30;
	
	public static void main(String[] args){
		System.out.println(c);
		
		//System.out.println(a);
		//System.out.println(b);
		int p = 10;
		InstanceVarDemo ivd1 = new InstanceVarDemo();
		System.out.println(ivd1.a);
		System.out.println(ivd1.b);
		ivd1.a = 100;
		ivd1.b = 200;
		
		A a1 = new A();
		System.out.println(a1.x);
		System.out.println(a1.y);
		a1.x = 10;
		a1.y = 20;
		
		System.out.println(ivd1.a);
		System.out.println(ivd1.b);
		System.out.println(a1.x);
		System.out.println(a1.y);
		
		
		
	}
}