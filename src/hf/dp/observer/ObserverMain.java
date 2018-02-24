/**
 * 
 */
package hf.dp.observer;

/**
 * @author root
 *
 */
public class ObserverMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WeatherData data = new WeatherData();
		
		CurrentConditionsDisplay current = new CurrentConditionsDisplay(data);
		
		data.setHumidity(30);
		data.setPressure(62);
		data.setTemperature(15);
		
		data.setHumidity(89);
		data.setTemperature(50);
		
	}

}
