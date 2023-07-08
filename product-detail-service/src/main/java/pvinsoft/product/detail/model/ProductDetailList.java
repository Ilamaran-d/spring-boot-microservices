package pvinsoft.product.detail.model;

import java.util.ArrayList;
import java.util.List;

public class ProductDetailList {

	private List<ProductDetail> detailList = new ArrayList<>();
	
	public ProductDetailList() {
		super();
	}
	
	public ProductDetailList(List<ProductDetail> detailList) {
		this.detailList = detailList;
	}

	public ProductDetailList(List<ProductDetail> detailList,	List<ProductPrice> priceList) {
		super();
		this.detailList = detailList;
	}

	public List<ProductDetail> getDetailList() {
		return detailList;
	}

	public void setDetailList(List<ProductDetail> detailList) {
		this.detailList = detailList;
	}

}
