package pvinsoft.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvinsoft.product.model.ProductCategory;
import pvinsoft.product.model.ProductCategoryList;
import pvinsoft.product.model.ProductDetail;
import pvinsoft.product.model.ProductPrice;
import pvinsoft.product.services.ProductService;


@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;
	
	@RequestMapping("/getAllCategory")
	public ProductCategoryList getAllCategory() {
		ProductCategoryList prdCtgryList = service.getAllCategory();
		return prdCtgryList;
	}
	
	@RequestMapping("/getProductByCategory/{id}")
	public ProductCategory getProductByCategory(@PathVariable(name = "id" ) String catId) {
		ProductCategory prdCtgry = service.getProductByCategoryId(catId);
		return prdCtgry;
	}
	
	@RequestMapping("/getProductAndPrice/{id}")
	public ProductDetail getProductAndPrice(@PathVariable String id){
		ProductDetail productDetail = service.getProductAndPrice(id);
		return productDetail;
	}
	
	@RequestMapping("/getProductPrice/{id}")
	public ProductPrice getProductPrice(@PathVariable String id){
		ProductPrice price = service.getProductPrice(id);
		return price;
	}
}
