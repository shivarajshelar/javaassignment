class B{
	int x = 10;
	int y = 20;
}

class FinalRefVarDemo{
	
	public static void main(String[] args){
		final int a = 10;
		//a = 20;
		
		final B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);
		
		b.x = 100;
		b.y = 200;
		
		//b = new B();
		
		
	}
}


