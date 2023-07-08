package pvinsoft.product.price.services;

import java.text.ParseException;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pvinsoft.product.price.common.EntityMapper;
import pvinsoft.product.price.dao.ProductPriceDAO;
import pvinsoft.product.price.dto.ProductPriceDTO;
import pvinsoft.product.price.model.ProductPrice;


@Service
public class ProductPriceServices {

	@Autowired
	ProductPriceDAO prdtPriceDAO;
	
	@Autowired
	EntityMapper mapper;
	
	public ProductPrice getPrice(String id) throws ParseException {
		ProductPriceDTO priceDTO = prdtPriceDAO.getPrice(id); 
		ProductPrice price = null;
		if(Objects.nonNull(priceDTO))
			price   = mapper.convertToEntity(priceDTO);
		return price;
	}
}
