package com.servebyte.inc.restaurant.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Menu {
	@Id
	private String id;
	private String name;
	private String description;
	private String price;
	
	public Menu() {
	}
	
	public Menu(String id, String name, String description, String price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}



	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	

}
