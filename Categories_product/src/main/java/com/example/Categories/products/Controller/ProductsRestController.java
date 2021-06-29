package com.example.Categories.products.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Categories.products.Repository.CategoriesRepository;
import com.example.Categories.products.Repository.ProductsRepository;
import com.example.Categories.products.Entity.Categories;
import com.example.Categories.products.Entity.Products;

@RestController
public class ProductsRestController {
	
	@Autowired
	CategoriesRepository categoriesRepository;
	
	@Autowired
	ProductsRepository productsRepository;
	
	@GetMapping("/categories/{id}")
	public Categories  Categories(@PathVariable("id") Long id) {
		Optional<Categories> findById = categoriesRepository.findById(id);
		return findById.get();	
	}
	
	@PostMapping("/categories")
	public void saveDetails(@RequestBody Products products ) {
		productsRepository.save(products);
	}
	

}
