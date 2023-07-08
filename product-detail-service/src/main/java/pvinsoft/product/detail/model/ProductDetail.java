package pvinsoft.product.detail.model;

public class ProductDetail {

	private String productId;
	
	private String categoryId;
	
	private String productName;
	
	private String productDesc;
	
	private ProductPrice price;
	
	public ProductDetail() {
		super();
	}

	public ProductDetail(String productId, String categoryId, String productName, String productDesc) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
		this.productName = productName;
		this.productDesc = productDesc;
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

	public ProductPrice getPrice() {
		return price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDetailDTO [productId=" + productId + ", categoryId=" + categoryId + ", productName=" + productName + ", productDesc=" + productDesc + "]";
	}
	
}
