package pvinsoft.product.detail.controller;

import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pvinsoft.product.detail.model.ProductDetailList;
import pvinsoft.product.detail.model.ProductDetail;
import pvinsoft.product.detail.services.ProductDetailService;

@RestController
@RequestMapping("/detail")
public class ProductDetailController  {
	
	@Autowired
	ProductDetailService service;
	
	
	@RequestMapping("/getList/{ids}")	
	public List<ProductDetail> getListOfProduct(@RequestParam(value="myParam[]") Iterable<String> ids) {
		return null;
	}
	
	@RequestMapping("/getProductsByCatNo/{catId}")	
	public ProductDetailList getProductsByCatNo(@PathVariable(name = "catId") String catId) throws ParseException {
		return service.getProductsByCatNo(catId);
	}
	
	@RequestMapping("/getProductAndPrice/{id}")
	public ProductDetail getProductDetail(@PathVariable String id){
		ProductDetail prdDetail = service.getProductDetail(id);
		return prdDetail;
	}
	
}
