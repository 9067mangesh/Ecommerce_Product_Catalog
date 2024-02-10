package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Category;

public interface CategoryService {

	List<Category> getAllCategories();
    
	Category getCategoryById(int id);
    
	Category UpdateCategory(Category category);
    
	void deleteCategory(int id);

	

	
}
