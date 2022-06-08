class TypeCastingDemo{
	public static void main(String[] args){
		int i = 132;
		//byte b =   i;
		byte b = (byte)i;
		System.out.println(b);
		
		//byte b2 = 130;
		byte b2 = (byte)132;
		System.out.println(b2);
		
		short s = (short)i;
		
		short s2 = (byte)i;// assigning byte to short
		
		//short s3 = (int)i;
		
		char c = (char)-1;
		System.out.println(c);
		System.out.println((int)c);
		
		
		
	}

}