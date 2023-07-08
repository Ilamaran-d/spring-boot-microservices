package pvinsoft.product.category.common;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pvinsoft.product.category.dto.ProductCategoryDTO;
import pvinsoft.product.category.model.ProductCategory;

@Component
public class EntityMapper {

	@Autowired
    private ModelMapper modelMapper;
	
	public ProductCategoryDTO convertToDto(ProductCategory category) {
		ProductCategoryDTO productCategoryDto = modelMapper.map(category, ProductCategoryDTO.class);
	    return productCategoryDto;
	}
	
	public ProductCategory convertToEntity(ProductCategoryDTO dto) throws ParseException {
		ProductCategory category = modelMapper.map(dto, ProductCategory.class);
	    return category;
	}
	
	
}

