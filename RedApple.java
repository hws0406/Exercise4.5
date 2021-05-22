public class RedApple extends Apple{
	Scanner scan = new Scanner(System.in);
	private String colour, origin;
	private double weight;
	
	public RedApple(String name, int q, double p, String c, String o, double weight) {
		super(name, q, p);
		this.color = c;
		this.origin = or;
		this.weight = w;
		
	}
	
	public String color() {
		return this.color;
	}
	
	public String origin() {
		return this.origin;
	}
	
	public double weight(){
		return weight;
	}
	
	public String toString() { //overriding method-dif classes
		return "\nApple name: " + super.name +
			   "\nColour: " + this.colour +
		       "\nOrigin: " + this.origin + 
		       "\n Weight: " + this.weight + "g/apple";
		}
}
