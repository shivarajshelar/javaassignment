
class InstanceVarDemo2{
	int a = 10;
	int b = 20;
	static int c = 30;
	
	static{
		System.out.println("Static block invoked!!");
		c = 50;
	}
	
	{
		System.out.println("Init block1 invoked!!");
		a = 1000;
		b = 2000;
	}
	{
		System.out.println("Init block2 invoked!!");
		a = 3000;
	}
	public static void main(String[] args){
		System.out.println(c);
		
		//System.out.println(a);
		//System.out.println(b);
		int p = 10;
		InstanceVarDemo2 ivd1 = new InstanceVarDemo2();
		//a = 3000
		//b = 2000
		System.out.println(ivd1.a);
		System.out.println(ivd1.b);
		ivd1.a = 100;
		ivd1.b = 100;
		
		System.out.println(ivd1.a);//100
		System.out.println(ivd1.b);//100
		
		ivd1 = new InstanceVarDemo2();
		System.out.println(ivd1.a);//1000
		System.out.println(ivd1.b);//2000
		
		ivd1 = new InstanceVarDemo2();
		System.out.println(ivd1.a);//1000
		System.out.println(ivd1.b);//2000
		
		
	}
}