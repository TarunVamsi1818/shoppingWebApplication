package com.example.shoppingWebApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoppingWebApplication.DAO.StandardCategoryDAO;
import com.example.shoppingWebApplication.Model.categoryModel;

@Service
public class categoryService {
	
	@Autowired
	StandardCategoryDAO dao;
	
	public categoryModel save(categoryModel c) {
		System.out.println(c);
		return dao.save(c);
	}	
}
