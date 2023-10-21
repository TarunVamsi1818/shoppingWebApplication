package com.example.shoppingWebApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.shoppingWebApplication.Model.categoryModel;
import com.example.shoppingWebApplication.service.categoryService;

@Controller
public class categoryController {

	@Autowired
	categoryService svc;
	
	@GetMapping("/home")
	public String homePage() {
		return "homePage";
	}
	
	@GetMapping("/AddCategory")
	public String AddCategory() {
		return "AddCategory";
	}
	@PostMapping("/category")
	public void save(/* @ModelAttribute("m")  categoryModel m*/String categoryTitle, String categoryDescription) {
		categoryModel model = new categoryModel();
		model.setCategoryTitle(categoryTitle);
		model.setCategoryDescription(categoryDescription);
		/*
		 * #svc.save(m); #return "Success";
		 */
		svc.save(model);
	}
}
