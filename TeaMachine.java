package SampleApp;
class Drink{
	public void refresherDrink(){
		System.out.println("This is refresher");
	}
}
class Tea extends Drink{
    public void greenTea(){
        System.out.println("This is GreenTea");
    }
}

 class Milk{
    public void hotMilk(){
        System.out.println(" It is a Milk");
    }
}

public class TeaMachine {
    public static void main(String args[]){
		
       Tea tea=new Tea();
	   tea.refresherDrink();
         tea.greenTea();
		 
       Milk milk=new Milk();
        milk.hotMilk();
		
    }
}
// child extends parent === IS-A type