package com.example.shoppingWebApplication.DAO;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.example.shoppingWebApplication.Model.ProductModel;

public interface StandardProductDAO extends JpaRepositoryImplementation<ProductModel, Integer>{

}
