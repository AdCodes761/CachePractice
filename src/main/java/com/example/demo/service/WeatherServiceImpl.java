package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Weather;
import com.example.demo.repository.WeatherRepository;

@Service
public class WeatherServiceImpl implements WeatherService {

	WeatherRepository repo;

	public WeatherServiceImpl(WeatherRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Weather getWeather(int id) {

		return repo.findById(id).get();
	}

	@Override
	public String saveWeather(Weather w) {

		repo.save(w);
		return "Weather added to DB";
	}

}
