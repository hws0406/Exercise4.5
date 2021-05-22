public class Mango extends Fruit{
	Scanner scan = new Scanner(System.in);
	private String size;
	private int weight;
	
	public Mango(String name, int q, double price) {
		super(name, q , p);
		System.out.println("Mango constructor is invoked");
		this.size = s;
		this.weight = w;
	}
	
	public String sizeMango() {
		return this.size;
	}
	
	public int weightMango() {
		return this.weight;
	}
}
