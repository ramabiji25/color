package com.medline.color.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medline.color.entity.Color;
import com.medline.color.service.ColorService;

@RestController
public class ColorController {
	
	@Autowired
	private ColorService colorservice;
	
	@PostMapping("/savecolor")
	
	public Color savecolor(@RequestBody Color color) {
		return colorservice.saveColor(color);
				
	}
	
	@GetMapping("/getallcolors")
public List<Color> fetchColortList(){
		
		return colorservice.fetchColorList();
	}
	
	@GetMapping("/color/{id}")
	public Color fetchColorBYID(@PathVariable("id") Long colorById) {
		return colorservice.fectchColorById(colorById);
	}
}
