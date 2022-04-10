package com.codingdojo.fruityloops.models;

public class itemModel {

	//member variables
	private String name;
	private double price;
	
	//constructor
	public itemModel(String name, double price) {
		this.setName(name);
		this.setPrice(price);
	}
	
	
	
    //Getters and Setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}
}
