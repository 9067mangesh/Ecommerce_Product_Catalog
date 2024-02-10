package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("/Ecommerce")
public class EcommerceController {
		
	@Autowired
    private ProductService productService;

	@Autowired
	private ProductRepository  prodRepo;
	
	@Autowired
	private CategoryRepository categRepo;
	
    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.UpdateProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable int id, @RequestBody Product product) {
        product.setProd_id(id);
        Product existingProduct=prodRepo.findById(id).get();
        existingProduct.setProd_name(product.getProd_name());
        existingProduct.setProd_price(product.getProd_price());
        return productService.UpdateProduct(existingProduct);
    }
    
    @PostMapping("/save/{cId}")
    public Product save(@PathVariable int categ_id, @RequestBody Product product) {
     Category category=categRepo.findById(categ_id).get();
     product.setCategory(category);
    	return prodRepo.save(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
}
