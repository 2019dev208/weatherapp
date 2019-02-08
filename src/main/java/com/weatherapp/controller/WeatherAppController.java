package com.weatherapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WeatherAppController {

	@GetMapping(value="/weatherReport")
	public String weatherReport(ModelMap model) {
		return "weatherInfo";
	}
}