package pvinsoft.product.detail.model;

public class ProductPrice {

	private String productId;
	
	private double productPrice;
	
	private double buyingPrice;
	
	private double sellingPrice;
	
	private double profit;
	
	private double loss;
	
	private String comments;

	public ProductPrice() {
		super();
	}

	public ProductPrice(String productId, double productPrice,
			double buyingPrice, double sellingPrice, double profit, double loss, String comments) {
		super();
		this.productId = productId;
		this.loss = loss;
		this.productPrice = productPrice;
		this.buyingPrice = buyingPrice;
		this.sellingPrice = sellingPrice;
		this.profit = profit;
		this.comments = comments;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public double getBuyingPrice() {
		return buyingPrice;
	}

	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}

	public double getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

	public double getLoss() {
		return loss;
	}

	public void setLoss(double loss) {
		this.loss = loss;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "ProductPriceDTO [productId=" + productId 
				+ ", loss=" + loss + ", productPrice=" + productPrice + ", buyingPrice="
				+ buyingPrice + ", sellingPrice=" + sellingPrice + ", profit=" + profit + ", comments=" + comments
				+ "]";
	}
	
}
