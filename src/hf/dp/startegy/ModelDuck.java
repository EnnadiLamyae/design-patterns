/**
 * 
 */
package hf.dp.startegy;

/**
 * @author root
 *
 */
public class ModelDuck extends Duck {
	
	
	public ModelDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}
	/* (non-Javadoc)
	 * @see hf.dp.startegy.Duck#display()
	 */
	@Override
	public void display() {
		System.out.println("I'm a model duck");
	}

}
