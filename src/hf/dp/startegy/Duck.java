/**
 * 
 */
package hf.dp.startegy;

/**
 * @author root
 *
 */
public abstract class Duck {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public abstract void display();
	
	public void swim() {
		System.out.println("All ducks float , even decoys :3");
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void performFly() {
		flyBehavior.fly();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
}
