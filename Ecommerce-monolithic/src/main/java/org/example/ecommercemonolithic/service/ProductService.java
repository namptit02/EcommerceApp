package org.example.ecommercemonolithic.service;



import org.example.ecommercemonolithic.models.CategoryEnum;
import org.example.ecommercemonolithic.models.Product;
import org.example.ecommercemonolithic.models.ProductDTO;
import org.example.ecommercemonolithic.models.ProductStatus;

import java.util.List;

public interface ProductService {

	public Product addProductToCatalog(String token, Product product);

	public Product getProductFromCatalogById(Integer id);

	public String deleteProductFromCatalog(Integer id);

	public Product updateProductIncatalog(Product product);
	
	public List<Product> getAllProductsIncatalog();
	
	public List<ProductDTO> getAllProductsOfSeller(Integer id);
	
	public List<ProductDTO> getProductsOfCategory(CategoryEnum catenum);
	
	public List<ProductDTO> getProductsOfStatus(ProductStatus status);
	
	
	
	public Product updateProductQuantityWithId(Integer id,ProductDTO prodDTO);

}
