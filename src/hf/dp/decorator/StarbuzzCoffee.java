/**
 * 
 */
package hf.dp.decorator;

/**
 * @author root
 *
 */
public class StarbuzzCoffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Beverage expresso = new Expresso();
		System.out.println(expresso.getDescription()+"  :  "+expresso.cost()+" $");
		expresso = new Mocha(expresso);
		System.out.println(expresso.getDescription()+"  :  "+expresso.cost()+" $");
		expresso = new Whip(expresso);
		System.out.println(expresso.getDescription()+"  :  "+expresso.cost()+" $");
		
	}

}
