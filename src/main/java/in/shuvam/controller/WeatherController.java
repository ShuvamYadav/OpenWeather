package in.shuvam.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.shuvam.entity.Country;

@RestController
public class WeatherController {
	final String appid="$yourapiid";
	final static String uri="http://api.openweathermap.org/data/2.5/weather?q=";
	@GetMapping("/getWeather/{name}")
	public String getWetaher(@PathVariable String name) {
		RestTemplate rest=new RestTemplate();
		 try { Country country=rest.getForObject(uri+name+appid,Country.class);
			  return country.toString();	
		 }
		 catch(Exception e) {
			 return e.getMessage();
		 }
	}

}
