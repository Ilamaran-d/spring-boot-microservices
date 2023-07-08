package pvinsoft.product.category.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import pvinsoft.product.category.dto.ProductCategoryDTO;
import pvinsoft.product.category.model.ProductCategory;

@Repository
public class ProductCategoryDAOImpl implements ProductCategoryDAO {

	@Override
	public List<ProductCategoryDTO> findAll() {
		ProductCategoryDTO obj1 = new ProductCategoryDTO("1001","101","Test Category Name1", "001","Test Sub Category Name1");
		ProductCategoryDTO obj2 =  new ProductCategoryDTO("1002","102","Test Category Name2", "002","Test Sub Category Name2");
		ProductCategoryDTO obj3 =  new ProductCategoryDTO("1003","103","Test Category Name3", "003","Test Sub Category Name3");
		
		return Arrays.asList(obj1,obj2, obj3);
	}



	@Override
	public List<ProductCategoryDTO> findAllById(Iterable<String> ids) {
		ProductCategoryDTO obj1 = new ProductCategoryDTO("1001","101","Test Category Name1", "001","Test Sub Category Name1");
		ProductCategoryDTO obj2 =  new ProductCategoryDTO("1002","102","Test Category Name2", "002","Test Sub Category Name2");
		ProductCategoryDTO obj3 =  new ProductCategoryDTO("1003","103","Test Category Name3", "003","Test Sub Category Name3");
		
		return Arrays.asList(obj1,obj2,obj3);
	}

	@Override
	public void deleteById(String id) {
		
	}

	@Override
	public ProductCategoryDTO getCategory(String id) {
		ProductCategoryDTO ctgryDto = new ProductCategoryDTO("1001","101","Test Category Name1", "001","Test Sub Category Name1");
		return ctgryDto;
	}



	@Override
	public List<ProductCategoryDTO> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends ProductCategoryDTO> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public <S extends ProductCategoryDTO> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void deleteInBatch(Iterable<ProductCategoryDTO> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public ProductCategoryDTO getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends ProductCategoryDTO> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends ProductCategoryDTO> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Page<ProductCategoryDTO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends ProductCategoryDTO> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Optional<ProductCategoryDTO> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void delete(ProductCategoryDTO entity) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll(Iterable<? extends ProductCategoryDTO> entities) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public <S extends ProductCategoryDTO> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends ProductCategoryDTO> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public <S extends ProductCategoryDTO> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public <S extends ProductCategoryDTO> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}



	@Override
	public int deleteCategory(String id) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public int updateCategory(ProductCategory dto) {
		// TODO Auto-generated method stub
		return 0;
	}



}
