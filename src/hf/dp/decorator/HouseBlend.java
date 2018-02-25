/**
 * 
 */
package hf.dp.decorator;

/**
 * @author root
 *
 */
public class HouseBlend extends Beverage {
	
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	/* (non-Javadoc)
	 * @see hf.dp.decorator.Beverage#cost()
	 */
	@Override
	public double cost() {
		return .88;
	}

}
