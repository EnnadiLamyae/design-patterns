/**
 * 
 */
package hf.dp.observer;

/**
 * @author root
 *
 */
public class CurrentConditionsDisplay implements DisplayElement, Observer {
	
	private float humidity;
	private float temperature;
	private float pressure;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.subscribe(this);
	}

	/* (non-Javadoc)
	 * @see hf.dp.observer.Observer#update(float, float, float)
	 */
	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	/* (non-Javadoc)
	 * @see hf.dp.observer.DisplayElement#display()
	 */
	@Override
	public void display() {
		System.out.println("Current Conditions : \n Humidity : "+humidity+"\n Temperature : "+temperature+"\n Pressure : "+pressure);
	}

}
