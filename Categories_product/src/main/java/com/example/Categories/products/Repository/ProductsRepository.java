package com.example.Categories.products.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Categories.products.Entity.Products;

public interface ProductsRepository extends CrudRepository<Products, Long> {

}
