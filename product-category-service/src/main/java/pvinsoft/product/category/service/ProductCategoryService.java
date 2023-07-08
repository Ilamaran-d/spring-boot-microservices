package pvinsoft.product.category.service;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import pvinsoft.product.category.common.AppProperties;
import pvinsoft.product.category.common.EntityMapper;
import pvinsoft.product.category.dao.ProductCategoryDAOImpl;
import pvinsoft.product.category.dto.ProductCategoryDTO;
import pvinsoft.product.category.model.ProductCategory;
import pvinsoft.product.category.model.ProductCategoryList;
import pvinsoft.product.category.model.ProductDetailList;

@Service
public class ProductCategoryService {

	private static final String URL_LIST_PRODUCT = "getProductsByCatNo/";
	
	@Autowired
	WebClient.Builder webclient;
	
	@Autowired
	ProductCategoryDAOImpl prdtCtgryDAO;
	
	@Autowired
	EntityMapper mapper;
	
	@Autowired
	AppProperties appProperties;
	
	public ProductCategory getProductsByCatNo(String id) throws ParseException {
		ProductDetailList productDetailList = webclient.build()
				.get().uri(appProperties.getDetailAppUrl()+ URL_LIST_PRODUCT +id)
				.retrieve()
				.bodyToMono(ProductDetailList.class)
				.block();
		ProductCategory category = mapper.convertToEntity(prdtCtgryDAO.getCategory(id));
		category.setProductDetailList(productDetailList.getDetailList());
		return   category;  
	}
	
	public ProductCategoryList getAllCategory() {
		List<ProductCategoryDTO>  listOfCategoryDTO = prdtCtgryDAO.findAll();
		List<ProductCategory>  listOfCategory = new ArrayList<>();
		listOfCategoryDTO.forEach(
	            (temp) -> { 
	            	try {
						listOfCategory.add(mapper.convertToEntity(temp));
					} catch (ParseException e) {
						e.printStackTrace();
					}
	            });
		ProductCategoryList list = new ProductCategoryList(listOfCategory);
		return list;
	}
	
}
