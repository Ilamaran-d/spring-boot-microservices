package pvinsoft.product.model;

import java.util.ArrayList;
import java.util.List;

public class ProductCategoryList {

	private List<ProductCategory> categoryList = new ArrayList<>();

	public ProductCategoryList() {
		super();
	}

	public ProductCategoryList(List<ProductCategory> categoryList) {
		super();
		this.categoryList = categoryList;
	}

	public List<ProductCategory> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<ProductCategory> categoryList) {
		this.categoryList = categoryList;
	}
	
	
}
