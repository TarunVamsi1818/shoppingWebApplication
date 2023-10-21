package com.example.shoppingWebApplication.Model;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="ProductModel")
public class ProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_des")
	private String productDescirption;
	
	@Column(name="product_price")
	private int ProductPrice;
	
	@Lob
    @Column(name = "product_img")
    private byte[] productImage;
	
	@Column(name="product_qty")
	private int productQuantity;
	
	@Column(name="product_dis")
	private int productDiscount;
	
	@ManyToOne
	private categoryModel category;

	public ProductModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescirption() {
		return productDescirption;
	}

	public void setProductDescirption(String productDescirption) {
		this.productDescirption = productDescirption;
	}

	public int getProductPrice() {
		return ProductPrice;
	}

	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}

	public byte[] getProductImage() {
		return productImage;
	}

	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	public categoryModel getCategory() {
		return category;
	}

	public void setCategory(categoryModel category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", productName=" + productName + ", productDescirption=" + productDescirption
				+ ", ProductPrice=" + ProductPrice + ", productImage=" + Arrays.toString(productImage)
				+ ", productQuantity=" + productQuantity + ", productDiscount=" + productDiscount + ", category="
				+ category + "]";
	}
	
}
