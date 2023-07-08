package pvinsoft.product.detail.dao;

import org.springframework.stereotype.Component;

import pvinsoft.product.detail.model.ProductDetail;

@Component
public class ProductDetailDAOImpl implements ProductDetailDAO{

	@Override
	public ProductDetail getDetail(String id) {
		ProductDetail detailDto = new ProductDetail("1001","101","101", "Test Category Name1");
		return detailDto;
	}

	@Override
	public int deleteDetail(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateDetail(ProductDetail dto) {
		// TODO Auto-generated method stub
		return 0;
	}

}
