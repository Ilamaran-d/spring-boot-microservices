package pvinsoft.product.detail.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "PRDCT_PRICE")
public class ProductPriceDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "PRDCT_ID", length = 4)
	private String productId;
	
	@Column(name = "PRDCT_PRICE")
	private double productPrice;
	
	@Column(name = "BUY_PRICE")
	private double buyingPrice;
	
	@Column(name = "SELL_PRICE")
	private double sellingPrice;
	
	@Column(name = "PROFIT_PRICE")
	private double profit;
	
	@Column(name = "LOSS_PRICE")
	private double loss;
	
	@Column(name = "COMMENTS")
	private String comments;

	public ProductPriceDTO() {
		super();
	}

	public ProductPriceDTO(String productId, double productPrice,
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
		return "ProductPriceDTO [id=" + id + ", productId=" + productId 
				+ ", loss=" + loss + ", productPrice=" + productPrice + ", buyingPrice="
				+ buyingPrice + ", sellingPrice=" + sellingPrice + ", profit=" + profit + ", comments=" + comments
				+ "]";
	}
	
}
