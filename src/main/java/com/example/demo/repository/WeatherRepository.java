package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Weather;

public interface WeatherRepository extends JpaRepository<Weather, Integer> {

}
