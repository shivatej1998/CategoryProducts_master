package com.example.Categories.products.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.Categories.products.Entity.Categories;

public interface CategoriesRepository extends CrudRepository<Categories, Long> {

}
