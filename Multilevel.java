class A{
	void m1(){
		System.out.println("A:m1()");
	}
	
	
}

class B extends A{
	void m2(){
		System.out.println("B:m2()");
	}
	
	void m6(int x, float y, double z){
		
	}

}

class C extends B{
	void m3(){
		System.out.println("C:m3()");
	}
}

class D extends C{
	void m4(){
		System.out.println("D:m4()");
	}
	
	void m1(){
		System.out.println("D:m1()");
	}
}


class MultiLevelInDemo{
	public static void main(String[] args){
		
		A a = new A();
		a.m1();
		//a.m2();
		//a.m3();
		//a.m4();
		
		A a1 = new B();
		a1.m1();
		//a1.m2();
		//a1.m3();
		//a1.m4();
		
		A a2 = new C();
		a2.m1();
		
		A a3 = new D();
		a3.m1();// D:m1()
		
		B b = new B();
		b.m1();
		b.m2();
		//b.m3();
		//b.m4();
		
		B b1 = new C();
		b1.m1();
		b1.m2();
		//b1.m3();
		//b1.m4();
		
		B b2 = new D();
		b2.m1();//D:m1()
		b2.m2();
		
		//B b3 = new A();// downcasting
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
		//c.m4();
		C c1 = new D();
		c1.m1();//D:m1()
		c1.m2();
		c1.m3();
		//c1.m4();
		
		D d = new D();
		d.m1();//D:m1()
		d.m2();
		d.m3();
		d.m4();
		
	}
}