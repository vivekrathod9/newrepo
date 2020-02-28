package com.indexial.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
	
public class ProductController {
	
List<Product> products = new ArrayList<Product>();
	
	{
		products.add(new Product(10, "Laptop1", 32422.11));
		products.add(new Product(20, "Laptop2", 34311.11));
	}
	
	@RequestMapping(value = "/",method = RequestMethod.POST)
	public String addProduct(@RequestBody Product product) {
		products.add(product);
		System.out.println("product added successfully...!");
		return "Product Added Successfully";
	}
	
	@RequestMapping(value = "/{pid}",method = RequestMethod.GET)
	public Product getProduct(@PathVariable("pid") int pid) {
		for (Product prod : products) {
			if(prod.getProductId() == pid) {
				return prod;
			}
		}
		System.out.println("Product not avaible");
		return null;
	}
}
