package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Prod_id;
    private String Prod_name;
    private double Prod_price;

   
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product() {
    	super(); 
    }

	public int getProd_id() {
		return Prod_id;
	}

	public void setProd_id(int prod_id) {
		Prod_id = prod_id;
	}

	public String getProd_name() {
		return Prod_name;
	}

	public void setProd_name(String prod_name) {
		Prod_name = prod_name;
	}

	public double getProd_price() {
		return Prod_price;
	}

	public void setProd_price(double prod_price) {
		Prod_price = prod_price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
	
}
