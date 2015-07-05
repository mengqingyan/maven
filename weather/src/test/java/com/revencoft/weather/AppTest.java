package com.revencoft.weather;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import cn.com.WebXml.WeatherWS;
import cn.com.WebXml.WeatherWSLocator;
import cn.com.WebXml.WeatherWSSoap;



/**
 * 
 * @author meng qingyan
 *
 */
public class AppTest {
   
	@Test
	public void testWeather() throws Exception {
		WeatherWS fs = new WeatherWSLocator();
		WeatherWSSoap soap = fs.getWeatherWSSoap();
		String[] aString = soap.getWeather("广州", null);
		List<String> string = Arrays.asList(aString);
		System.out.println(string);
	}
	
}
