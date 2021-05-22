import java.text.DecimalFormat;

public class Main {
	
	private static DecimalFormat df2 = new DecimalFormat("#.##"); 
	
	public static void main(String[] args) {
		
		//Fruit f = new Fruit //no need new object for super class
		
		Durian d = new Durian("Durian", 'y', 100,10.00);
		System.out.println(d);//print using overriding method
		System.out.println("Does the durian have thorns?: " + d.HasThorns());
		System.out.println("Calories: " + d.Calories());
		System.out.println();
		
		Mango m = new Mango("Mango",150, 4.00);
		System.out.println(m);//print using overriding method
		System.out.println();
		
		Apple a = new Apple("Apple", 180, 2.00);
		System.out.println(a);//print using overriding method
		System.out.println();
		
		RedApple pl = new RedApple("Red Apple", 300, 0.80, "Red", "China" , 120.0);
		System.out.println(ra);//print using overriding method
		System.out.println();
		
		GreenApple gs = new GreenApple("Green Apple", 300, 0.60, "Green", "US", 105.0);
		System.out.println(ga);//print using overriding method
		System.out.println();
	}
}
