/**
 * 
 */
package hf.dp.observer.builtin;

/**
 * @author root
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
		
		weatherData.setMesurements(30.5, 25, 11.9);
		weatherData.setMesurements(30.5, 15, 98);
		weatherData.setMesurements(60.5, 25, 11.9);

	}

}
