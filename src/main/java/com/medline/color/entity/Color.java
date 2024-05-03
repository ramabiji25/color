package com.medline.color.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Color {
	
	
	@Id
	@Column(name="color_id")
	private long color_id;
	
	@Column(name="color_name")
	
	private String color_name;

}
