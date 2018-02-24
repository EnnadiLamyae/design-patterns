/**
 * 
 */
package hf.dp.observer.builtin;

import java.util.Observable;
import java.util.Observer;

import hf.dp.observer.DisplayElement;

/**
 * @author root
 *
 */
public class CurrentDisplay implements DisplayElement, Observer {
	
	private double temperature ;
	private double humidity;
	private double pressure;
	private Observable observable;

	
	
	public CurrentDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	/* (non-Javadoc)
	 * @see java.util.Observer#update(java.util.Observable, java.lang.Object)
	 */
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) o;
			temperature = weatherData.getTemperature();
			pressure = weatherData.getPressure();
			humidity = weatherData.getHumidity();
			display();
		}

	}

	/* (non-Javadoc)
	 * @see hf.dp.observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("Current Condition : \n Temperature : "+temperature
				+ " \n Pressure : "+pressure+" \n Humidity: "+humidity);
		

	}

}
