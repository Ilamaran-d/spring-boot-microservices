package pvinsoft.product.price.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pvinsoft.product.price.model.ProductPrice;
import pvinsoft.product.price.services.ProductPriceServices;

@RestController
@RequestMapping("/price")
public class ProductPriceController {

	@Autowired
	ProductPriceServices services;
	
	@RequestMapping("/getPrice/{id}")
	public ProductPrice getPrice(@PathVariable String id) throws ParseException {
		return services.getPrice(id);
	}
}
