
package com.mars.springjdbc.dao;

import java.util.List;
 
import com.mars.springjdbc.model.Product;
 
public interface ProductDAO {
	Product getProductById(int PROD_ID);
	List<Product> getAllProducts();
	//boolean deleteProduct(Product pro);
	int deleteProduct(int PROD_ID);
	boolean updateProduct(Product pro);
	boolean createProduct(Product pro);
 
	
 
}