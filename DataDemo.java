class DataTypeDemo{
	public static void main(String[] args){
		byte b = 100;
		//byte b2 = 130;
		short s = 130;
		//short s2 = 33000;
		
		boolean bool = true;
		
		float f = 10.23F;
		double d = 10.23d;
		
		
		char c = 97; // Assign ASCII char against 97
		c = 'a';
		System.out.println(c);
		
		char c2 = 65000;
		System.out.println(c2);
		
		d = f;
		
		System.out.println(d);
		
		f = d;
	}

}