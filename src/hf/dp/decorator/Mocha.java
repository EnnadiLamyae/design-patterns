/**
 * 
 */
package hf.dp.decorator;

/**
 * @author root
 *
 */
public class Mocha extends CondimentDecorator {

	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	/* (non-Javadoc)
	 * @see hf.dp.decorator.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription()+" , Mocha";
	}

	/* (non-Javadoc)
	 * @see hf.dp.decorator.Beverage#cost()
	 */
	@Override
	public double cost() {
		return .88 + beverage.cost();
	}

}
