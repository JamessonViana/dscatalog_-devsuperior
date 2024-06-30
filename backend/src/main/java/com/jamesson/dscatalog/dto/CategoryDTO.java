package com.jamesson.dscatalog.dto;

import java.io.Serializable;

import com.jamesson.dscatalog.entities.Category;

public class CategoryDTO implements Serializable{
	 private static final long serialVersionUID = 1L;
	
	private Long Id;
	private String name;
	
	public CategoryDTO() {
	 
	}

	public CategoryDTO(Long id, String name) {
		this.Id = id;
		this.name = name;
	}
	
	public CategoryDTO(Category c) {
		this.Id = c.getId();
		this.name = c.getName();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	

}
