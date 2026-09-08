package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Weather {
	@Id
  int pin;
  String cityName;
  int temp;
  public int getPin() {
	return pin;
  }
  public void setPin(int pin) {
	this.pin = pin;
  }
  public String getCityName() {
	return cityName;
  }
  public void setCityName(String cityName) {
	this.cityName = cityName;
  }
  public int getTemp() {
	return temp;
  }
  public void setTemp(int temp) {
	this.temp = temp;
  }
  @Override
  public String toString() {
	return "Weather [pin=" + pin + ", cityName=" + cityName + ", temp=" + temp + "]";
  }
}
