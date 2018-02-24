/**
 * 
 */
package hf.dp.observer;

/**
 * @author root
 *
 */
public interface Subject {

	public void subscribe(Observer observer);
	public void unsubscribe(Observer observer);
	public void notifyObservers();
}
