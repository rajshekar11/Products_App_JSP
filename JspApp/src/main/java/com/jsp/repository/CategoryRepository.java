package com.jsp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {

}
