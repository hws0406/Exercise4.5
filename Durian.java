public class Durian extends Apple{
	Scanner scan = new Scanner(System.in);
	private char thorns;
	private double kcal = 800;
	
	public Durian(String name, char t, int c, int q, double p) {
		super(name, q, p);
		this.thorns = t;
		System.out.println("Durian constructor is invoked");
		Calories(q,kcal);
	}
	
	public char HasThorns() {
		return 'y';
	}
	
	public void Calories(int q,double kcal) {//overriding method-dif classes
		double total = q*kcal;
		System.out.println("Total calories of "+ q + " durian :" + total + "kcal.");
	}
}
