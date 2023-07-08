package pvinsoft.product.price.dao;


import org.springframework.stereotype.Component;

import pvinsoft.product.price.dto.ProductPriceDTO;

@Component
public class ProductPriceDAOImpl implements ProductPriceDAO{

	@Override
	public ProductPriceDTO getPrice(String id) {
		ProductPriceDTO priceDTO = new ProductPriceDTO("1001", 56.50, 56.00, 57.10, 1.10, 0.00, "TEST COMMENTS");
		return priceDTO;
	}

}
