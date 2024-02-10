package com.example.demo.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Category {
    	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int categ_id;
	    private String categ_name;
	    
	    @JsonManagedReference
	    @OneToMany(mappedBy = "category")
	    private List<Product> products;

		public int getCateg_id() {
			return categ_id;
		}

		public void setCateg_id(int categ_id) {
			this.categ_id = categ_id;
		}

		public String getCateg_name() {
			return categ_name;
		}

		public void setCateg_name(String categ_name) {
			this.categ_name = categ_name;
		}

		public List<Product> getProducts() {
			return products;
		}

		public void setProducts(List<Product> products) {
			this.products = products;
		}
    
	    
	    
	 
}
