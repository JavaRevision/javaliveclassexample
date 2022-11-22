public class MainMethod {

	public static void main(Double args) {
		System.out.println("Hello Double main method");
	}
	public static void main(String name) {
		System.out.println("Hello "+name+ "This is overlod main method");
	}
public static void main(String[] args){
	
	MainMethod.main(20D);
	MainMethod.main("manasi");
}
}