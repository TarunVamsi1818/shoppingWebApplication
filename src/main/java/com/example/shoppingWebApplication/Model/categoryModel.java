package com.example.shoppingWebApplication.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Category")
public class categoryModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="category_title")
	private String categoryTitle;
	@Column(name="category_desc")
	private String categoryDescription;
	@OneToMany(mappedBy="category")
	private List<ProductModel> products = new ArrayList<ProductModel>();
	public categoryModel() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getCategoryDescription() {
		return categoryDescription;
	}
	public void setCategoryDescription(String categoryDescription) {
		this.categoryDescription = categoryDescription;
	}
	public List<ProductModel> getProducts() {
		return products;
	}
	public void setProducts(List<ProductModel> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "categoryModel [id=" + id + ", categoryTitle=" + categoryTitle + ", categoryDescription="
				+ categoryDescription + ", products=" + products + "]";
	}
}
