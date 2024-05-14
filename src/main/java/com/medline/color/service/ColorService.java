package com.medline.color.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medline.color.entity.Color;
import com.medline.color.repository.ColorRepository;

@Service
public class ColorService {
	
	@Autowired
	private ColorRepository colorrepository;
	
	public Color saveColor(Color color) {
		
		return colorrepository.save(color);
	}
	public List<Color> fetchColorList() {
		// TODO Auto-generated method stub
		return colorrepository.findAll();
	}
	public Color fectchColorById(Long colorById) {
		// TODO Auto-generated method stub
		return colorrepository.findById(colorById).get();
	
	

}
}