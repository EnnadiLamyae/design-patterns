/**
 * 
 */
package hf.dp.decorator;

/**
 * @author root
 *
 */
public class Whip extends CondimentDecorator {
	Beverage beverage;
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	/* (non-Javadoc)
	 * @see hf.dp.decorator.CondimentDecorator#getDescription()
	 */
	@Override
	public String getDescription() {
		return beverage.getDescription()+ " , Whip";
	}

	/* (non-Javadoc)
	 * @see hf.dp.decorator.Beverage#cost()
	 */
	@Override
	public double cost() {
		return 1.99 + beverage.cost();
	}

}
