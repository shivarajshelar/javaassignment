class AIM{
	int x = 100;
	
	void m1(){
		System.out.println("AIM:m1() invoked!!");
		
	}
}
class InstanceMethodDemo{
	int a = 10;
	int b = 20;
	static int c = 30;
	
	static void m1(){
		System.out.println("m1() invoked!!");
	}
	
	void m2(){
		System.out.println("m2 invoked!!");
	}
	
	public static void main(String[] args){
		System.out.println(InstanceMethodDemo.c);
		InstanceMethodDemo.m1();
		
		InstanceMethodDemo imd = new InstanceMethodDemo();
		System.out.println(imd.a);
		System.out.println(imd.b);
		imd.m2();
		
		AIM aim = new AIM();
		System.out.println(aim.x);
		aim.m1();
	}
}