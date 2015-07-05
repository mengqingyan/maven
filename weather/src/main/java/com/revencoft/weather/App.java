package com.revencoft.weather;

import java.util.Arrays;
import java.util.List;

import cn.com.WebXml.WeatherWS;
import cn.com.WebXml.WeatherWSLocator;
import cn.com.WebXml.WeatherWSSoap;

/**
 * 
 * @author meng qingyan
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		WeatherWS fs = new WeatherWSLocator();
		WeatherWSSoap soap = fs.getWeatherWSSoap();
		String[] aString = soap.getWeather("广州", null);
		List<String> string = Arrays.asList(aString);
		System.out.println(string);
	}
}
