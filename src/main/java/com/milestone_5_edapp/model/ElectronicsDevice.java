package com.milestone_5_edapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // This annotation is used for defining it as an Entity
@Table(name="electronicsDevice") // it is used to make it as table as employee.
public class ElectronicsDevice {
	
	@Id // it define as primary key  // auto generated values for id unique 
	private long id;
	
	@Column(name="name", nullable = false)  // it is used to define it as a column
	private String name;
	
	@Column(name="categary")
	private String categary;
	
	@Column(name="price")
	private int price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategary() {
		return categary;
	}

	public void setCategary(String categary) {
		this.categary = categary;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
