/**
 * 
 */
package hf.dp.startegy;

/**
 * @author root
 *
 */
public class MuteQuack implements QuackBehavior {

	/* (non-Javadoc)
	 * @see hf.dp.startegy.QuackBehavior#quack()
	 */
	@Override
	public void quack() {
		
		System.out.println("<<Silence>>");
	}

}
