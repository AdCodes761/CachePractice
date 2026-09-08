package com.example.demo.cache;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Weather;

public class Cache {
	List<Weather> l = new ArrayList<>();

	public Weather getData(int pin) {
		return l.get(pin);
	}

	public void saveData(Weather w) {
		l.add(w);
	}
}
