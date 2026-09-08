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
			cache.getData(pin);
		}
              
		Weather w= repo.findById(pin).get();
		cache.saveData(w);
		return w;
	}

	@Override
	public String saveWeather(Weather w) {

		repo.save(w);
		cache.saveData(w);
		return "Weather added to DB and cache";
	}

}
