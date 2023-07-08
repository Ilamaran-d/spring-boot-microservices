package pvinsoft.product.price.dao;

import org.springframework.stereotype.Component;

import pvinsoft.product.price.dto.ProductPriceDTO;

@Component
public interface ProductPriceDAO  {

	public ProductPriceDTO getPrice(String id);
	
}
