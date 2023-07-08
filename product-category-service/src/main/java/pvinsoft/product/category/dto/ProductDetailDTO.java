package pvinsoft.product.category.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "PRDCT_DETAIL")
public class ProductDetailDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "PRDCT_ID", length = 4)
	private String productId;
	
	@Column(name = "CTGRY_ID", length = 3)
	private String categoryId;
	
	@Column(name = "PRDCT_NME", length = 40)
	private String productName;
	
	@Column(name = "PRDCT_DESC", length = 50)
	private String productDesc;
	
	@OneToMany(targetEntity=ProductPriceDTO.class, mappedBy="productId", fetch=FetchType.EAGER)
	private List<ProductPriceDTO> priceList;
	
	public ProductDetailDTO() {
		super();
	}

	public ProductDetailDTO(String productId, String categoryId, String productName, String productDesc) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.productDesc = productDesc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public List<ProductPriceDTO> getPriceList() {
		return priceList;
	}

	public void setPriceList(List<ProductPriceDTO> priceList) {
		this.priceList = priceList;
	}

	@Override
	public String toString() {
		return "ProductDetailDTO [productId=" + productId + ", categoryId=" + categoryId + ", productName=" + productName + ", productDesc=" + productDesc + "]";
	}
	
}
