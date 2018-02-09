/**
 * 
 */
package hf.dp.startegy;

/**
 * @author root
 *
 */
public class MallardDuck extends Duck {
	
	

	/**
	 * 
	 */
	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	/* (non-Javadoc)
	 * @see hf.dp.startegy.Duck#display()
	 */

	public void display() {
		System.out.println("I am a real Mallard Duck");
	}

}
