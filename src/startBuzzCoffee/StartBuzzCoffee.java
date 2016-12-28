package startBuzzCoffee;

import beverage.Beverage;
import beverage.Espresso;
import beverage.HouseBlend;
import condiment.Milk;
import condiment.Mocha;

public class StartBuzzCoffee {
	public static void main(String[] args) {
		
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new HouseBlend();
		beverage2 = new Milk(beverage2);
		beverage2 = new Mocha(beverage2);
		
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	}
}
