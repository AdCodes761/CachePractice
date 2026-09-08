package com.example.demo.cache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Weather;
@Component
public class Cache {
	List<Weather> l = new ArrayList<>();

	public Weather getData(int pin) {
		for (Weather w:l) {
			if(w.getPin()==pin)
				return w;
		}
		return null;
	}

	public void saveData(Weather w) {
		l.add(w);
	}
	public boolean checkData(int pin) {
           for(Weather w : l) {
        	   if(w.getPin()==pin)
        		   return true;
           }
           return false;
	}
}
