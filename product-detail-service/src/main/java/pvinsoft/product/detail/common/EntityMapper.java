package pvinsoft.product.detail.common;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pvinsoft.product.detail.dto.ProductDetailDTO;
import pvinsoft.product.detail.model.ProductDetail;

@Component
public class EntityMapper {

	@Autowired
    private ModelMapper modelMapper;
	
	public ProductDetailDTO convertToDto(ProductDetail detail) {
		ProductDetailDTO productDetailDto = modelMapper.map(detail, ProductDetailDTO.class);
	    return productDetailDto;
	}
	
	public ProductDetail convertToEntity(ProductDetailDTO dto) throws ParseException {
		ProductDetail detail = modelMapper.map(dto, ProductDetail.class);
	    return detail;
	}
	
	
}

