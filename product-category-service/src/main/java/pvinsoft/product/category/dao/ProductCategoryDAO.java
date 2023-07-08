package pvinsoft.product.category.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import pvinsoft.product.category.dto.ProductCategoryDTO;
import pvinsoft.product.category.model.ProductCategory;

@Component
public interface ProductCategoryDAO extends JpaRepository<ProductCategoryDTO, String>{
	
	public ProductCategoryDTO getCategory(@PathVariable String id) ;
	
	public int deleteCategory(@PathVariable String id);
	
	public int updateCategory(@PathVariable ProductCategory dto);
}
