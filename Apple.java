public class Apple extends Fruit {
	Scanner scan = new Scanner(System.in);
	private String colour;
	protected int quantity;
	protected double price;
	
	public Apple(String name, int q, double p) { //subclass, constructor with 3 arguments
		super(name);
		this.quantity = q;
		this.price = p;
	
		if (this.quantity <= 15) {
			totalPrice(); //overloading with no arguments as nothing change
			System.out.println(name);
			System.out.println("\nTotal price: RM" + totalPrice());
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = 1.50; 
			totalPrice(pp); ///overloading with 1 arguments as price=1.50 if quantity > 15
			System.out.println(name);
			System.out.println("\nIf quantity more than 15, Total price: RM" + totalPrice(pp));
		}
		
			else { //have discount if more than 100, price become 1.00
			double pp = 1.00; 
			double dd;
			
			
			if(name == "Red Apple"|| name == "Apple") {
				pp = 0.80;
				getdiscount d = new AppleDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				discount = dd.rateofdiscount();
				System.out.println(name);
			}
			else if (name == "Durian") {
				p = 10.00;
				getdiscount d = new DurianDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				discount = d.rateofdiscount();
				System.out.println(name);
				
			}
			else if (name == "Mango") {
				pr = 4.00;
				getdiscount d = new MangoDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				discount = d.rateofdiscount();
				System.out.println(name);
				
			}
			else if (name == "Green Apple") {
				pr = 0.60;
				getdiscount d = new AppleDiscount();//create new object for Apple discount
				System.out.println("You have purchase "+q+" "+name);
				discount = d.rateofdiscount();
				System.out.println(name);
			}
			}
			totalPrice(dd, pp); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(dd,pp));
		}
		
	}
	
	
	public double totalPrice() {
		return this.price * this.quantity;
		
	}
	
	public double totalPrice(double pp) {
		return pp * this.quantity;
	}
	
	public double totalPrice(double qq, double pp) {
		return (pp * this.quantity) * qq;
	}
	
}
