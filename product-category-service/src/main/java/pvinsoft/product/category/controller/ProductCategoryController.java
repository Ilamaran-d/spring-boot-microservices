package pvinsoft.product.category.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvinsoft.product.category.model.ProductCategory;
import pvinsoft.product.category.model.ProductCategoryList;
import pvinsoft.product.category.service.ProductCategoryService;


@RestController
@RequestMapping("/category")
public class ProductCategoryController {

	@Autowired
	ProductCategoryService service;
	
	@RequestMapping("/getAllCategory")
	public ProductCategoryList getAllCategory() {
		ProductCategoryList prdCtgryList = service.getAllCategory();
		return prdCtgryList;
	}
	
	@RequestMapping("/getListOfProductByCatId/{catId}")
	public ProductCategory getProductsByCatNo(@PathVariable(name = "catId") String catId) throws ParseException {
		return service.getProductsByCatNo(catId);
	}
	
}
