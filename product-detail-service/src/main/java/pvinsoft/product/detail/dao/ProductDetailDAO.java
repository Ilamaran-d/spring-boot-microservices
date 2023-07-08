package pvinsoft.product.detail.dao;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import pvinsoft.product.detail.model.ProductDetail;


@Component
public interface ProductDetailDAO {

	public ProductDetail getDetail(@PathVariable String id) ;
	
	public int deleteDetail(@PathVariable String id);
	
	public int updateDetail(@PathVariable ProductDetail dto);
}
