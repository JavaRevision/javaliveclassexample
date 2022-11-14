// Achive HAS-A Relation 

class Mobile{
	
	public void samsung(){
		System.out.println("Samsung is mobile");
	}
	
	public static void main(String args[]){
		Battery battery= new Battery();
		battery.lithium();
		battery.lithiumPolymer();
		
		Sim sim= new Sim();
		sim.Airtel();
		sim.Idea();
	}
	
}