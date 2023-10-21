package com.example.shoppingWebApplication.DAO;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.shoppingWebApplication.Model.categoryModel;

public interface StandardCategoryDAO extends JpaRepositoryImplementation<categoryModel, Integer>{

}

