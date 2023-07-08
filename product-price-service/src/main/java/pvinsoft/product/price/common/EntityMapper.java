package pvinsoft.product.price.common;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pvinsoft.product.price.dto.ProductPriceDTO;
import pvinsoft.product.price.model.ProductPrice;

@Component
public class EntityMapper {

	@Autowired
    private ModelMapper modelMapper;
	
	public ProductPriceDTO convertToDto(ProductPrice price) {
		ProductPriceDTO productPriceDto = modelMapper.map(price, ProductPriceDTO.class);
	    return productPriceDto;
	}
	
	public ProductPrice convertToEntity(ProductPriceDTO productPriceDto) throws ParseException {
		ProductPrice post = modelMapper.map(productPriceDto, ProductPrice.class);
	    return post;
	}
	
	
}

