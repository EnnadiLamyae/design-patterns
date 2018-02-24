/**
 * 
 */
package hf.dp.observer.builtin;

import java.util.Observable;
import java.util.Observer;

/**
 * @author root
 *
 */
public class WeatherData extends Observable {
	
	private double temperature;
	private double pressure;
	private double humidity;
	
	public WeatherData() {
	
	}
	
	public void mesurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
	public void setMesurements(double temperature , double humidity, double pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		mesurementsChanged();
	}

	public double getTemperature() {
		return temperature;
	}

	public double getPressure() {
		return pressure;
	}

	public double getHumidity() {
		return humidity;
	}
	
	
	
	

}
