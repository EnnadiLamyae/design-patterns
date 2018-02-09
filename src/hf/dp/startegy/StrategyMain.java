/**
 * 
 */
package hf.dp.startegy;

/**
 * @author root
 *
 */
public class StrategyMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.swim();
		mallard.performFly();
		mallard.performQuack();
		
		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.performQuack();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
