package com.dennis.repositories;

import org.springframework.data.repository.CrudRepository;

import com.dennis.entity.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>{

}
