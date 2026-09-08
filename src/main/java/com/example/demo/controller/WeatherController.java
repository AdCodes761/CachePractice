package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Weather;
import com.example.demo.service.WeatherService;

@RestController
public class WeatherController {

	WeatherService ws;


	public WeatherController(WeatherService ws) {
		super();
		this.ws = ws;
	}


	@GetMapping("getWeather/{pin}")
	public Weather getWeather(@PathVariable int pin) {
		return ws.getWeather(pin);
	}

	
	@PostMapping("saveWeather")
	public String saveWeather(@RequestBody Weather w) {
		return ws.saveWeather(w);
	}
}
