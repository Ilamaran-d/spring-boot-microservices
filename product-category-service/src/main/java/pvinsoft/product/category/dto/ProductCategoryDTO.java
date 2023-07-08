package pvinsoft.product.category.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "PRDCT_CATEGORY")
public class ProductCategoryDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "PRDCT_ID", length = 4)
	private String productId;
	
	@Column(name = "CTGRY_ID", length = 3)
	private String categoryId;
	
	@Column(name = "CTGRY_NME", length = 40)
	private String categoryName;
	
	@Column(name = "SUB_CTGRY_ID", length = 3)
	private String subCatategoryId;
	
	@Column(name = "SUB_CTGRY_NAME", length = 40)
	private String subCategoryName;
	
	@OneToMany(targetEntity=ProductDetailDTO.class, mappedBy="productId", fetch=FetchType.EAGER)
	private List<ProductDetailDTO> productDetailList;
	
	
	public ProductCategoryDTO() {
		super();
	}

	public ProductCategoryDTO(String productId, String categoryId, String categoryName, String subCatategoryId,
			String subCategoryName) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.subCatategoryId = subCatategoryId;
		this.subCategoryName = subCategoryName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
	
	public List<ProductDetailDTO> getProductDetailList() {
		return productDetailList;
	}

	public void setProductDetailList(List<ProductDetailDTO> productDetailList) {
		this.productDetailList = productDetailList;
	}

	@Override
	public String toString() {
		return "ProductCategoryDTO [productId=" + productId + ", categoryId=" + categoryId
				+ ", categoryName=" + categoryName + ", subCatategoryId=" + subCatategoryId + ", subCategoryName="
				+ subCategoryName + "]";
	}
	
}
