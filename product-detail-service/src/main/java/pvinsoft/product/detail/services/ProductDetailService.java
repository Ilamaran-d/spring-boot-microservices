package pvinsoft.product.detail.services;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.reactive.function.client.WebClient;

import pvinsoft.product.detail.common.AppProperties;
import pvinsoft.product.detail.common.EntityMapper;
import pvinsoft.product.detail.dao.ProductDetailDAO;
import pvinsoft.product.detail.dto.ProductDetailDTO;
import pvinsoft.product.detail.model.ProductDetailList;
import pvinsoft.product.detail.model.ProductDetail;
import pvinsoft.product.detail.model.ProductPrice;


@Service
public class ProductDetailService {

	private static final String URL_PRODUCT_PRICE = "getPrice/";
	
	@Autowired
	WebClient.Builder webclient;
	
	@Autowired
	ProductDetailDAO prdtDetailDAO;
	
	@Autowired
	EntityMapper mapper;
	
	@Autowired
	AppProperties appProperties;
	
	public List<ProductDetail> getListOfProductDetails(String productIds){
		return Collections.singletonList(new ProductDetail("1001","101","Test Product", "Test Product Description"));
	}
    
    
    public ProductDetailList getProductsByCatNo( String catId) throws ParseException {
    	ProductDetailDTO obj1 = new ProductDetailDTO("1001","101","Test Product1", "Test Product Description1");
    	ProductDetailDTO obj2 =  new ProductDetailDTO("1002","101","Test Product2", "Test Product Description2");
    	ProductDetailDTO obj3 =  new ProductDetailDTO("1003","101","Test Product3", "Test Product Description3");
    	
    	ProductDetailList productList = new ProductDetailList();
    	productList.setDetailList(Arrays.asList(mapper.convertToEntity(obj1),mapper.convertToEntity(obj2),mapper.convertToEntity(obj3)));
    	return productList;
	}
    
    public ProductDetail getProductDetail(@PathVariable String id) {
    	ProductDetail productDetail = prdtDetailDAO.getDetail(id); //new ProductDetail("1001","101","Test Product1", "Test Product Description1");
    	
    	ProductPrice price = webclient.build()
				.get().uri(appProperties.getPriceAppUrl()+ URL_PRODUCT_PRICE +id)
				.retrieve()
				.bodyToMono(ProductPrice.class)
				.block();
    	productDetail.setPrice(price);
		return productDetail;
	}
}
