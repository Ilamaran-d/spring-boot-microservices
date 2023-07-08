package pvinsoft.product.model;

import java.util.ArrayList;
import java.util.List;

public class ProductCategory {

	private String categoryId;
	
	private String categoryName;
	
	private String subCatategoryId;
	
	private String subCategoryName;
	
	private List<ProductDetail> productDetailList = new ArrayList<>();
	
	public ProductCategory() {
		super();
	}

	public ProductCategory(String categoryId, String categoryName, String subCatategoryId,
			String subCategoryName) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.subCatategoryId = subCatategoryId;
		this.subCategoryName = subCategoryName;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getSubCatategoryId() {
		return subCatategoryId;
	}

	public void setSubCatategoryId(String subCatategoryId) {
		this.subCatategoryId = subCatategoryId;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}
	
	public List<ProductDetail> getProductDetailList() {
		return productDetailList;
	}

	public void setProductDetailList(List<ProductDetail> productDetailList) {
		this.productDetailList = productDetailList;
	}

	@Override
	public String toString() {
		return "ProductCategoryDTO [CategoryId=" + categoryId
				+ ", CategoryName=" + categoryName + ", SubCatategoryId=" + subCatategoryId + ", SubCategoryName="
				+ subCategoryName + "]";
	}
	
}
