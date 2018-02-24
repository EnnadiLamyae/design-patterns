/**
 * 
 */
package hf.dp.observer;

import java.util.ArrayList;

/**
 * @author root
 *
 */
public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float humidity;
	private float temperature;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}
	/* (non-Javadoc)
	 * @see hf.dp.observer.Subject#subscribe(hf.dp.observer.Observer)
	 */
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	/* (non-Javadoc)
	 * @see hf.dp.observer.Subject#unsubscribe(hf.dp.observer.Observer)
	 */
	@Override
	public void unsubscribe(Observer observer) {
		int index = observers.indexOf(observer);
		if(index >= 0)
			observers.remove(index);
	}

	/* (non-Javadoc)
	 * @see hf.dp.observer.Subject#notifyObservers()
	 */
	@Override
	public void notifyObservers() {
		for(Observer observer : observers)
			observer.update(temperature, humidity, pressure);
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		notifyObservers();
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		notifyObservers();
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
		notifyObservers();
	}
	

}
