class Demo{
	
	/*static{
		System.out.println("hello from static block");
	}*/
	
	public static void add(){
		int a=20;
		int b=10;
		int c= a+b;	
		System.out.println("Addition " + c);
			greetings();
		sub();
	}
	public static void sub(){
		int a=20;
		int b=10;
		int c= a-b;	
		System.out.println("Subtraction " + c);
	}
	public static void multi(){
		int a=20;
		int b=10;
		int c= a*b;	
		System.out.println("multiplication " + c);
	}
	public static void div(){
		int a=20;
		int b=10;
		int c= a/b;	
		System.out.println("division " + c);
	}
	
	public static void main(String args[]){
		
		System.out.println("Arithmatic operation");
	
		Demo demo = new Demo();
		demo.add();
		demo.sub();
		demo.multi();
		demo.div();
	
	}
	
	public  static void greetings(){
		System.out.println("Hello Java");
		
	}	
		
}