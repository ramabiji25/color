package com.medline.color.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medline.color.entity.Color;

public interface ColorRepository extends JpaRepository<Color, Long>{

}
