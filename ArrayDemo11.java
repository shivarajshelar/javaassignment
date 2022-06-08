class Person{

	String name;
	int age;
	
	void print(){
		System.out.println(this.name +" "+this.age);
	}
}

class ArrayDemo{
	public static void main(String[] args){
		
		
		
		int[] arr = new int[10];
		//arr[0] = 10; // 10 20 30 40 50 60 70 80 90 100
		// 0 1 2 3 4 5 6 7 8 9
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		for(int i=1;i<=10;i++){
			arr[i-1] = i*2;
		}
		
		for(int i=1;i<=10;i++){
			System.out.println(arr[i-1]);
		}
		
		
		// 2-D array
		int[][] arr2d = new int[2][5];
		int counter = 0;
		for(int i=0;i<2;i++){
			for (int j=0;j<5;j++){
				/*if(i == 0){
					arr2d[i][j] = (j+1) * 2;
				}else{
					arr2d[i][j] = (j+1) * 3;
				}*/
				arr2d[i][j] = counter++;
				
			}
		}
		
		for(int i=0;i<arr2d.length;i++){
			for (int j=0;j<arr2d[i].length;j++){
				System.out.print(arr2d[i][j]+" ");
			}
			System.out.println();
		}
		
		/***/
		// Array of reference
		
		Person[] parr = new Person[5];
		
		Person p1 = new Person();
		p1.name = "A";
		p1.age = 20;
		parr[0] = p1;
		
		parr[1] = new Person();
		parr[1].name = "B";
		parr[1].age = 30;
		
		Person p2 = new Person();
		parr[2] = p2;
		p2.name = "C";
		p2.age = 30;
		
		
		parr[3] = new Person();
		parr[3].name = "D";
		parr[3].age = 40;
		
		
		parr[0].print();
		parr[1].print();
		parr[2].print();
		parr[3].print();
		//parr[4].print();//null.print()
		
		
		int row = Integer.parseInt(args[0]);
		int col = Integer.parseInt(args[1]);
		int[][] arr2d2 = new int[row][col];
		
		for(int i = 0;i< arr2d2.length;i++){
			for(int j=0;j< arr2d2[i].length;j++){
				System.out.print(arr2d2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(args.length);
	}
}