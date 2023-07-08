package pvinsoft.product.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import pvinsoft.product.common.AppProperties;
import pvinsoft.product.model.ProductCategory;
import pvinsoft.product.model.ProductCategoryList;
import pvinsoft.product.model.ProductDetail;
import pvinsoft.product.model.ProductPrice;


@EnableConfigurationProperties({AppProperties.class})
@Service
public class ProductService {
	
	private static final String URL_LIST_PRODUCT = "getListOfProductByCatId/";
	private static final String URL_LIST_CATEGORY = "getAllCategory/";
	private static final String URL_PRODUCT_AND_PRICE = "getProductAndPrice/";
	private static final String URL_PRODUCT_PRICE = "getProductPrice/";
	
	@Autowired
	WebClient.Builder builder;
	
	@Autowired
	AppProperties appProperties;
	
	public ProductCategory getProductByCategoryId(String catId) {
		ProductCategory categoryDTO = builder.build()
				.get()
				.uri(appProperties.getCategoryAppUrl()+ URL_LIST_PRODUCT +catId)
				.retrieve()
				.bodyToMono(ProductCategory.class)
				.block();
		return categoryDTO;
	}
	
	public ProductCategoryList getAllCategory() {
		
		ProductCategoryList categoryList = builder.build()
				.get()
				.uri(appProperties.getCategoryAppUrl()+URL_LIST_CATEGORY)
				.retrieve()
				.bodyToMono(ProductCategoryList.class)
				.block();
		return categoryList;
	}
	
	
	public ProductDetail getProductAndPrice(String id) {
		ProductDetail productDetail = builder.build()
				.get()
				.uri(appProperties.getDetailAppUrl()+ URL_PRODUCT_AND_PRICE +id)
				.retrieve()
				.bodyToMono(ProductDetail.class)
				.block();
		
		return productDetail;
	}
	
	public ProductPrice getProductPrice(String id) {
		ProductPrice productPrice = builder.build()
				.get()
				.uri(appProperties.getPriceAppUrl()+ URL_PRODUCT_PRICE +id)
				.retrieve()
				.bodyToMono(ProductPrice.class)
				.block();
		
		return productPrice;
	}
}
