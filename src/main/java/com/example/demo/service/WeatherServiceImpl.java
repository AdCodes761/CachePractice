package com.example.demo.service;


import org.springframework.stereotype.Service;

import com.example.demo.cache.Cache;
import com.example.demo.entity.Weather;
import com.example.demo.repository.WeatherRepository;

@Service
public class WeatherServiceImpl implements WeatherService {

	WeatherRepository repo;
   Cache cache;
	public WeatherServiceImpl(WeatherRepository repo,Cache cache) {
		super();
		this.repo = repo;
		this.cache=cache;
	}

	@Override
	public Weather getWeather(int pin) {
		if(cache.checkData(pin)) {
			System.out.println("got weather from cache");
			return cache.getData(pin);
		}
              System.out.println("got weather from db");
		Weather w= repo.findById(pin).orElse(null);
		if(w != null)
		cache.saveData(w);
		return w;
	}

	@Override
	public String saveWeather(Weather w) {

		repo.save(w);
	
		return "Weather added to DB and cache";
	}

}
